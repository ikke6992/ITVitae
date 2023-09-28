

public abstract class Kamer implements KamerInterface {

    private VasteGrootteGroep<Gast> gasten;
    
    public Kamer(int grootte) {
        gasten = new VasteGrootteGroep<Gast>(grootte);
    }

    public void checkIn(Groep<Gast> gasten) {
        
        if (!this.gasten.isLeeg()) {
            throw new KamerAlBezetException("Deze kamer is bezet");
        } else if (this.gasten.getCapaciteit() < gasten.getCapaciteit()) {
            throw new KamerTeKleinException("Deze kamer is te klein");
        }

        for (Gast gast : gasten) {
            this.gasten.add(gast);
        }
    }

    public void checkOut() {
        gasten.maakLeeg();
    }

    public VasteGrootteGroep<Gast> getGasten() {
        return gasten;
    }

}

class EenPersoonsKamer extends Kamer {

    EenPersoonsKamer() {
        super(1);
    }
}

class TweePersoonsKamer extends Kamer {

    TweePersoonsKamer() {
        super(2);
    }
}

class VierPersoonsKamer extends Kamer {

    VierPersoonsKamer() {
        super(4);
    }
}

class KamerAlBezetException extends RuntimeException {

    public KamerAlBezetException(String message) {
        super(message);
    }
}

class KamerTeKleinException extends RuntimeException {

    public KamerTeKleinException(String message) {
        super(message);
    }
}


