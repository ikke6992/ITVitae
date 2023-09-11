import java.util.Set;
import java.nio.charset.Charset;

public class ShowCharsets {

    public static void main(String[] args) {
        Set<String> charsets = Charset.availableCharsets().keySet();
        for(String charset : charsets) {
            System.out.println(charset);
        }
    }
}