import java.math.BigInteger;

public class Minutes {

    public static BigInteger yearsToMinutes(int years) {
        BigInteger result = BigInteger.valueOf((long)(365*24*60));
        return result.multiply(BigInteger.valueOf((long)years));
    }

    public long monthsToMinutes(int months) {
        return months*30*24*60;
    }

    public long weeksToMinutes(int weeks) {
        return weeks*7*24*60;
    }

    public long daysToMinutes(int days) {
        return days*24*60;
    }

    public short hoursToMinutes(int hours) {
        return (short)(hours*60);
    }

    public static void main(String[] args) {
        System.out.println(yearsToMinutes(500000000));
    }


}