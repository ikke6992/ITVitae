package bank;

import java.time.LocalDate;

public class Persoon {

    private String naam;
    private String adres;
    private LocalDate geboortedatum;
    
    private Rekening rekening;

    public Persoon(String naam, String adres, LocalDate geboortedatum) {
        this.naam = naam;
        this.adres = adres;
        this.geboortedatum = geboortedatum;
        rekening = Medewerker.maakRekening(this);
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getGeboortedatum() {
        return geboortedatum.toString();
    }

    public int getRekeningnummer() {
        return rekening.getNummer();
    }
    
}
