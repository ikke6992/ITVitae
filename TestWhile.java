import java.util.Arrays;

public class TestWhile {

    public static int[] testWhile() {
        int[] result = new int[5];
        int i = 0;
        while(i < 5) {
            result[i] = i + 2;
            i++;
        }
        return result;
    }

    public static int[] testDoWhile() {
        int[] result = new int[5];
        int i = 0;
        do {
            result[i] = i + 2;
            i++;
        } while(i < 5);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(testWhile()));
        System.out.println(Arrays.toString(testDoWhile()));
    }
    
}
