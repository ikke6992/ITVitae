public class NumberConverter {

    public static String convertBinToHex(String binNumber) {
        return Integer.toHexString(Integer.parseInt(binNumber, 2)).toUpperCase();
    }

    public static String convertBinToDec(String binNumber) {
        return Integer.toString(Integer.parseInt(binNumber, 2));
    }

    public static String convertBinToOct(String binNumber) {
        return Integer.toOctalString(Integer.parseInt(binNumber, 2));
    }

    public static String convertOctToHex(String octNumber) {
        return Integer.toHexString(Integer.parseInt(octNumber, 8)).toUpperCase(); 
    }

    public static String convertOctToDec(String octNumber) {
        return Integer.toString(Integer.parseInt(octNumber, 8)); 
    }

    public static String convertOctToBin(String octNumber) {
        return Integer.toBinaryString(Integer.parseInt(octNumber, 8)); 
    }

    public static String convertDecToHex(String decNumber) {
        return Integer.toHexString(Integer.parseInt(decNumber)).toUpperCase();
    }

    public static String convertDecToOct(String decNumber) {
        return Integer.toOctalString(Integer.parseInt(decNumber));
    }

    public static String convertDecToBin(String decNumber) {
        return Integer.toBinaryString(Integer.parseInt(decNumber));
    }

    public static String convertHexToDec(String hexNumber) {
        return Integer.toString(Integer.parseInt(hexNumber, 16));
    }

    public static String convertHexToOct(String hexNumber) {
        return Integer.toOctalString(Integer.parseInt(hexNumber, 16));
    }

    public static String convertHexToBin(String hexNumber) {
        return Integer.toBinaryString(Integer.parseInt(hexNumber, 16));
    }
}