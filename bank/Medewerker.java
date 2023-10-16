package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medewerker {

    private static List<Rekening> rekeningen = new ArrayList<Rekening>();

    public static void overboeking(double bedrag, Rekening van, Rekening naar) throws TeWeinigSaldoException {
        if (van.huidigSaldo() - bedrag < - 1000) {
            throw new TeWeinigSaldoException();
        } else {
            van.overboeken(bedrag, naar);
        }
    }

    public static void storting(double bedrag, Rekening rekening) {
        rekening.storten(bedrag);

    }

    public static Rekening getRekening(int rekeningnummer) throws RekeningBestaatNietException {
        
        for (Rekening rekening : rekeningen) {
            if (rekening.getNummer() == rekeningnummer) {
                return rekening;
            }
        }

        throw new RekeningBestaatNietException(rekeningnummer);
    }

    public static Rekening getRekening(String naam) throws RekeningBestaatNietException {

        for (Rekening rekening : rekeningen) {
            if (rekening.getEigenaar().equals(naam)) {
                return rekening;
            }
        }

        throw new RekeningBestaatNietException(naam);
    }

    public static Rekening maakRekening(Persoon persoon) {
        Rekening rekening = new Rekening(persoon);
        rekeningen.add(rekening);
        return rekening;
    }

    public static Rekening voerRekeningIn(String input) throws RekeningBestaatNietException {
        Rekening rekening;
        try {
            int rekeningnummer = Integer.parseInt(input);
            rekening = getRekening(rekeningnummer);
        } catch (NumberFormatException e) {
            rekening = getRekening(input);
        }
        
        return rekening;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean next = true;
        do {
            System.out.print("Wat wilt u doen? OPTIES:\n" +
                "1: Rekening openen\n2: Rekening bekijken\n3: Sluiten\n");
            int i = in.nextInt();
            in.nextLine();
            switch (i) {
                case 1: System.out.print("Voer uw naam in: ");
                    String naam = in.nextLine();
                    System.out.print("Voer uw adres in: ");
                    String adres = in.nextLine();
                    System.out.print("Voer uw geboortejaar in: ");
                    int jaar = in.nextInt();
                    System.out.print("Voer uw geboortemaand in: ");
                    int maand = in.nextInt();
                    System.out.print("Voer uw geboortedag in: ");
                    int dag = in.nextInt();
                    LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);
                    new Persoon(naam, adres, geboortedatum);
                    break;
                case 2: System.out.println("Welke rekening wil u zien?");
                    String input = in.nextLine();
                    Rekening rekening;
                    try {
                        rekening = voerRekeningIn(input);
                    } catch (RekeningBestaatNietException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    
                    System.out.print("Wat wilt u doen? OPTIES:\n" +
                        "1: Storten\n2: Overboeken\n3: Geschiedenis inzien\n");
                    int j = in.nextInt();
                    in.nextLine();
                    switch(j) {
                        case 1: storting(in.nextInt(), rekening);
                            break;
                        case 2: try {
                                Rekening bestemming = voerRekeningIn(in.nextLine());
                                overboeking(in.nextInt(), rekening, bestemming);
                            } catch (RekeningBestaatNietException e) {
                                System.out.println(e.getMessage());
                                continue;
                            } catch (TeWeinigSaldoException e) {
                                System.out.println(e.getMessage());
                                continue;
                            }
                            break;
                        case 3: System.out.println(rekening.geschiedenis());
                            break;
                        default: System.out.println("Foute invoer");
                    }
                    break;
                case 3: next = false;
                    break;
                default: System.out.println("Foute invoer");
            }
        } while(next);
    }

    
}

class TeWeinigSaldoException extends Exception {
    public TeWeinigSaldoException() {
        super("Te Weinig Saldo");
    }
}

class RekeningBestaatNietException extends Exception {
    public RekeningBestaatNietException(int rekeningnummer) {
        super("Rekening met nummer " + rekeningnummer + " bestaat niet");
    }

    public RekeningBestaatNietException(String naam) {
        super("Rekening van " + naam + " bestaat niet");
    }
}