

public class Gast {

    private static final String[] VOORNAMEN = {
        "Adam", "Sofie", "Johan", "Yuri", "Marie", "Fred", "Lisa", "Robin",
        "Claartje", "Freek", "Piet", "Pietje", "Erik", "Bas", "Pavlov", "Igor",
        "Ivan", "Geertje", "Klaas", "Snorri", "Anna", "Lotte", "Sara", "Roos",
        "Noor", "Thor", "Jean", "Karel", "Dick", "Richard", "Dzjengis", "Emma",
        "Howard Phillips", "Peter", "Sint", "Albert", "Dirk Jan", "Taylor",
        "Linus", "James", "Bjarne", "Jurriaan", "Jan-Klaassen"
        };
    private static final String[] ACHTERNAMEN = {
        "de Vries", "Smit", "Petersen", "Vonk", "Janssen", "Klaassen",
        "de Trompetter", "Baantjes", "de Jong", "Sanchez", "Bakker", "Eggertsson",
        "Sturluson", "Valjean", "de Grote", "Precies", "Khan", "Snorremans",
        "de Cock met C-O-C-K", "Stallman", "Lovecraft", "Erklaas", "Gagarin",
        "Einstein", "Heijn", "de Geer", "Swift", "Torvalds", "Gosling",
        "Stroustrup"
        };

    private final String VOORNAAM;
    private final String ACHTERNAAM;
    
    public Gast() {
        VOORNAAM = VOORNAMEN[(int)(Math.random()*VOORNAMEN.length)];
        ACHTERNAAM = ACHTERNAMEN[(int)(Math.random()*ACHTERNAMEN.length)];

    }

    public Gast(String voornaam, String achternaam) {
        VOORNAAM = voornaam;
        ACHTERNAAM = achternaam;
    }

    public String toString() {
        return VOORNAAM + " " + ACHTERNAAM;
    }
    
}
