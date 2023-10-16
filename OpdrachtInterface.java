interface OpdrachtInterface {
    // Maak LocalTime object aan en print
    void maakTijd(String tijd);

    // Maak LocalDate object aan en print
    void maakDatum(String datum);

    // Combineer LocalDate object en LocalTime object tot LocalDateTime en print
    void combineer();

    // Maak formatter
    void maakFormatter(String format);

    // Print opgegeven jaar maand en dag m.b.v. eerder gemaakte formatter
    void printMetFormatter(int jaar, int maand, int dag);

    // Maak periode van eerder gemaakte datum tot ingevoerde datum en print
    void periodeTot(String input);

    // Zet het LocalTime object m.b.v. het eerder gemaakte LocalDateTime object, en print
    void tijdVanDatumTijd();

    // Print de dag van de maand die in het eerder gemaakte LocalDateTime object staat
    void printDagVanMaand();

    // Check of datum van LocalDateTime object na ingevoerde datum-tijd is, print resultaat 
    void printIsNa(String input);
 
    // Print LocalDateTime die eerder gemaakt is, maar vervang dan de dag van de maand met input
    void printMetDagVanMaand(int input);

    // Print LocalTime object met gegeven uren opgeteld
    void printTijdPlusUren(int uren);

    // Print LocalTime object met gegeven uren afgetrokken
    void printTijdMinUren(int uren);

    // Print datum met tijd van LocalDate en LocalTime
    void printDatumOpTijd();

    // Zet LocalDateTime om naar LocalTime en print
    void printDatumTijdNaarTijd();
}
