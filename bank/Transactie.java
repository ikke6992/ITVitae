package bank;

import java.time.LocalDateTime;

public abstract class Transactie {

    private String type;
    private double bedrag;
    private LocalDateTime datum;

    public Transactie(String type, double bedrag) {
        this.type = type;
        this.bedrag = bedrag;
        datum = LocalDateTime.now();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(datum.toString() + "\t");
        builder.append(type + "\t" + bedrag);
        return builder.toString();
    }

    
}
