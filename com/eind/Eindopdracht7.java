package com.eind;

public class Eindopdracht7 {

    boolean hasRoeispaan;
    boolean inRaft;

    public Eindopdracht7() {
        hasRoeispaan = true;
        inRaft = true;
    }

    public void raft() {
        int counter = 0;
        do {
            try {
                val();
                if (hasRoeispaan) {
                    roeispaan();
                }
            } catch (ValUitRaftException e) {
                inRaft = false;
                System.out.println("GEVALLEN!");
                if (hasRoeispaan) {
                    grijpRoeispaan();
                } else {
                    grijpTouw();
                }
            } catch (VerliesRoeispaanException e) {
                hasRoeispaan = false;
                System.out.println("ROEISPAAN KWIJT!");
                zitStil();
            } finally {
                counter++;
            }
        } while (counter < 3);

        betaal();
    }

    public void val() throws ValUitRaftException {

        int val = (int)(Math.random()*5);

        if (val == 1) {
            throw new ValUitRaftException();
        }
    }

    public void roeispaan() throws VerliesRoeispaanException {

        int roeispaan = (int)(Math.random()*5);

        if (roeispaan == 1) {
            throw new VerliesRoeispaanException();
        }
    }

    public void grijpRoeispaan() {
        System.out.println("Pak de roeispaan!");
        inRaft = true;
    }

    public void grijpTouw() {
        System.out.println("Pak het touw!");
        inRaft = true;
    }

    public void zitStil() {
        System.out.println("Blijf stilzitten!");
    }

    public int betaal() {
        System.out.println("BETAALD!");
        return 250;
    }

    public static void main(String[] args) {

        Eindopdracht7 raft = new Eindopdracht7();

        raft.raft();

        /*try {
            raft.roeispaan();
            raft.val();
            System.out.println("geen problemen deze keer");
        } catch (ValUitRaftException e) {
            System.out.println("GEVALLEN!");
            if (raft.hasRoeispaan) {
                raft.grijpRoeispaan();
            } else {
                raft.grijpTouw();
            }
        } catch (VerliesRoeispaanException e) {
            System.out.println("ROEISPAAN KWIJT!");
            raft.zitStil();

        } finally {
            raft.betaal();
            System.out.println("BETAALD!");
        }*/

    }
    
}

class ValUitRaftException extends Exception {

    public ValUitRaftException() {
    }


}

class VerliesRoeispaanException extends Exception {

    public VerliesRoeispaanException() {
    }

}
