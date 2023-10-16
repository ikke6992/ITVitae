package vehicle;

import java.util.regex.Pattern;

public interface CarInterface {

    public static final Pattern plateFormat = Pattern.compile("(\\w{2}-\\d{2}-\\d{2})|(\\d{2}-\\d{2}-\\w{2})|(\\d{2}-\\w{2}-\\d{2})|(\\w{2}-\\d{2}-\\w{2})|(\\w{2}-\\w{2}-\\d{2})|(\\d{2}-\\w{2}-\\w{2})|(\\d{2}-\\w{3}-\\d{1})|(\\d{1}-\\w{3}-\\d{2})|(\\w{2}-\\d{3}-\\w{1})|(\\w{1}-\\d{3}-\\w{2})|(\\w{3}-\\d{2}-\\w{1})|(\\d{1}-\\w{2}-\\d{3})");

    public void setLicense(String license) throws InvalidPlateException;

    public String getLicense();

    public void printInfo();
    
}

class InvalidPlateException extends Exception {

    public InvalidPlateException(String licensePlate) {
        super(licensePlate + " is not the correct format for a License Plate");
    }
}
