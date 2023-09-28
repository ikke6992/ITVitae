

import java.util.Scanner;

public class Receptie {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        System.out.printf("Welkom bij het mainframe van %s.\n", hotel.getNaam());

        do {
            System.out.print("Geldige commando's zijn 'checkin', 'checkuit', 'status' en 'stop'.\n\n");
            System.out.print("Voer een commando in: ");

            String input = scanner.nextLine();

            if (input.toLowerCase().equals("checkin")) {
                System.out.print("Hoeveel gasten? ");
                int aantal = scanner.nextInt();
                scanner.nextLine();
                Groep<Gast> gasten = new Groep<Gast>(aantal);

                for (int i = 0; i < aantal; i++) {
                    Gast gast = new Gast();
                    gasten.add(gast);
                }

                try {
                    hotel.checkIn(gasten);
                } catch (GroepPastNietException teGroot) {
                    System.out.println(teGroot.getMessage());
                }

            } else if (input.toLowerCase().equals("checkuit")) {
                
                System.out.print("Welk kamernummer? ");
                int kamernummer = scanner.nextInt();
                scanner.nextLine();

                hotel.checkUit(kamernummer);

            } else if (input.toLowerCase().equals("status")) {

                for (int i = 0; i < hotel.getAantalKamers(); i++) {
                    Groep<Gast> gasten = hotel.getKamer(i).getGasten();
                    System.out.printf("Kamer %d (maximaal %d gasten)\n", i, gasten.getCapaciteit());
                    if (gasten.isLeeg()) {
                        System.out.print("\tLeeg\n");
                    } else {
                        for (Gast gast : gasten) {
                            System.out.printf("\t%s\n", gast.toString());
                        }
                    }
                }
            } else if (input.toLowerCase().equals("stop")) {
                running = false;
            }

        } while(running);
    }
    
}
