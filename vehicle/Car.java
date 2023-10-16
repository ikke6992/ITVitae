package vehicle;

import java.time.LocalDate;

public class Car extends Vehicle implements CarInterface {

    private int maxSpeed;
    private String licensePlate;
    private final String brand;
    private final String model;
    private LocalDate regDate;
    
    public Car(int weight, String colour, int maxSpeed, String licensePlate, String brand, String model, LocalDate regDate) throws InvalidPlateException {
        setWeight(weight);
        setColour(colour);
        setMaxSpeed(maxSpeed);
        setLicense(licensePlate);
        this.brand = brand;
        this.model = model;
        setRegDate(regDate);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getLicense() {
        return licensePlate;
    }

    public void setLicense(String licensePlate) throws InvalidPlateException {
        if (plateFormat.matcher(licensePlate).matches()) {
            this.licensePlate = licensePlate;
        } else {
            throw new InvalidPlateException(licensePlate);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegDate() {
        return regDate.toString();
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public void printInfo() {
        StringBuilder print = new StringBuilder();

        print.append(getBrand() + " " + getModel() + "\t" + getLicense() + "\n");
        print.append("Registration Date: " + getRegDate() + "\n");
        print.append("Colour: " + getColour() + "\n");
        print.append("Weight: " + getWeight() + "kg\n");
        print.append("Maximum Speed: " + getMaxSpeed() + "km/h\n");
        
        System.out.println(print);
    }
    
}
