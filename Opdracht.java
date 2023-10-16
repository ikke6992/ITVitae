import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Opdracht implements OpdrachtInterface{
    static LocalTime tijd;
    static LocalDate datum;
    static LocalDateTime datumTijd;
    static Period periode;
    static DateTimeFormatter formatter;

    public void maakTijd(String tijd) {
        System.out.println(this.tijd = LocalTime.parse(tijd));
    }

    public void maakDatum(String datum) {
        System.out.println(this.datum = LocalDate.parse(datum));
    }

    public void combineer() {
        System.out.println(datumTijd = LocalDateTime.of(datum, tijd));
    }

    public void maakFormatter(String format) {
        formatter = DateTimeFormatter.ofPattern(format);
    }

    public void printMetFormatter(int jaar, int maand, int dag) {
        System.out.println(LocalDate.of(jaar, maand, dag).format(formatter));
    }

    public void periodeTot(String input) {
        System.out.println(periode = Period.between(datum, LocalDate.parse(input)));
    }

    public void tijdVanDatumTijd() {
        System.out.println(datumTijd.toLocalTime());
    }

    public void printDagVanMaand() {
        System.out.println(datumTijd.getDayOfMonth());
    }

    public void printIsNa(String input) {
        System.out.println(datumTijd.isAfter(LocalDateTime.parse(input)));
    }

    public void printMetDagVanMaand(int input) {
        System.out.println(datumTijd.withDayOfMonth(input));
    }

    public void printTijdPlusUren(int uren) {
        System.out.println(tijd.plusHours(uren));
    }

    public void printTijdMinUren(int uren) {
        System.out.println(tijd.minusHours(uren));
    }

    public void printDatumOpTijd() {
        System.out.println(datum + "T" + tijd);
    }

    public void printDatumTijdNaarTijd() {
        System.out.println(datumTijd.toLocalTime());
    }

	public static void main(String[] args) {
        Opdracht kalender = new Opdracht();
        kalender.maakTijd("14:30:20");
        kalender.maakDatum("2019-12-12");
        kalender.combineer();
        kalender.maakFormatter("d MMM uuuu");
        kalender.printMetFormatter(2019, 12, 01);
        kalender.periodeTot("2021-12-12");
        kalender.tijdVanDatumTijd();
        kalender.printDagVanMaand();
        kalender.printIsNa("2016-10-08T11:45:09");
        kalender.printMetDagVanMaand(5);
        kalender.printTijdPlusUren(3);
        kalender.printTijdMinUren(1);
        kalender.printDatumOpTijd();
        kalender.printDatumTijdNaarTijd();
    }
}