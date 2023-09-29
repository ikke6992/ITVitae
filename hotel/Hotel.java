

public class Hotel implements HotelInterface {

    private static final String[] NAAM_STEDEN = {
        "Budapest", "Bucharest", "Chisinau", "Tbilisi", "Munich", "Warsaw",
        "Cluj", "Moscow", "Zagreb", "Prague", "Ljubljana", "California"
        };

    private static final String[] NAAM_TEMPLATES = {
        "Grand %s Hotel", "Royal %s Hotel", "Hotel %s", "%s Hotel",
        "Hotel of %s"
        };
    
    private String naam = String.format(NAAM_TEMPLATES[(int)(Math.random()*NAAM_TEMPLATES.length)], NAAM_STEDEN[(int)(Math.random()*NAAM_STEDEN.length)]);
    private VasteGrootteGroep<Kamer> kamers;

    public Hotel(int aantalKamers) {

        //naam = String.format(NAAM_TEMPLATES[(int)(Math.random()*NAAM_TEMPLATES.length)], NAAM_STEDEN[(int)(Math.random()*NAAM_STEDEN.length)]);

        kamers = new VasteGrootteGroep<Kamer>(aantalKamers);

        int index = 0;

        for (; index < aantalKamers/4; index++) {
            kamers.add(new EenPersoonsKamer());
        }

        for (; index <= aantalKamers/4*3; index++) {
            kamers.add(new TweePersoonsKamer());
        }

        for (; index < aantalKamers; index++) {
            kamers.add(new VierPersoonsKamer());
        }
    }

    public Hotel() {
        this(10);
    }

    public void checkIn(Groep<Gast> groep) throws GroepPastNietException {

        boolean ingecheckt = false;

        for (Kamer kamer : kamers) {
            try {
                kamer.checkIn(groep);
                ingecheckt = true;
                break;
            } catch (KamerAlBezetException e) {
                continue;
            } catch (KamerTeKleinException e) {
                continue;
            }
        }

        if (!ingecheckt) {
            throw new GroepPastNietException("Deze groep past niet in een kamer");
        }

        /*
        int capaciteit = 0;
        Groep<Kamer> beschikbaar = new Groep<>(1);

        for (Kamer kamer : kamers) {
            if (kamer.getGasten().isLeeg()) {
                beschikbaar.add(kamer);
                capaciteit += kamer.getGasten().getCapaciteit();
            }
        }

        if (capaciteit < groep.getCapaciteit()) {
            throw new GroepPastNietException("Het Hotel is te vol voor deze groep");
        } else {
            Groep<Gast> temp = groep;
            for (Kamer kamer : beschikbaar) {
                try {
                    kamer.checkIn(temp);
                } catch (KamerTeKleinException teKlein) {

                    Groep<Gast> checkInGasten = new Groep<Gast>(kamer.getGasten().getCapaciteit());
                    Groep<Gast> overigeGasten = new Groep<Gast>(temp.getCapaciteit() - kamer.getGasten().getCapaciteit());

                    for (int i = 0; i < temp.getCapaciteit(); i++) {
                        if (i < checkInGasten.getCapaciteit()) {
                            checkInGasten.add(temp.get(i));
                        } else {
                            overigeGasten.add(temp.get(i));
                        }
                    }

                    kamer.checkIn(checkInGasten);
                    temp = overigeGasten;

                    System.out.println();
                }
            }
        }
        */

    }
    
    public void checkUit(int kamernummer) {
        getKamer(kamernummer).checkOut();

    }

    public Kamer getKamer(int nummer) {
        return kamers.get(nummer);
    }

    public int getAantalKamers() {
        return kamers.getCapaciteit();
    }

    public String getNaam() {
        return naam;
    }
}

class GroepPastNietException extends RuntimeException {

    public GroepPastNietException(String message) {
        super(message);
    }
}