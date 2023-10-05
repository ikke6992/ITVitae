import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenBestand {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
