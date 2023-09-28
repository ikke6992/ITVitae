public class Tafel {

    private static final int MAX_TAFEL = 10;
    
    public static String tafelTabel(int grootte) {

        StringBuilder builder = new StringBuilder();

        builder.append(String.format("%3s|", "*"));
        for (int init = 1; init <= MAX_TAFEL; init++) {
            builder.append(String.format("%4d", init));
        }

        builder.append("\n");
        builder.append("-".repeat(MAX_TAFEL*4+5));
        builder.append("\n");

        for (int i = 1; i <= grootte; i++) {

            builder.append(String.format("%3d|", i));
            
            for (int j = 1; j <= MAX_TAFEL; j++) {
                builder.append(String.format("%4d", i*j));
            }
            builder.append("\n");
        }

        return builder.toString();


    }

    public static void main(String[] args) {
        System.out.println(tafelTabel(100));
    }
}
