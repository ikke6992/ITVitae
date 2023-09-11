package vehicle;

import java.time.LocalDate;

public class Car extends Vehicle {

    private int maxSpeed;
    private String licensePlate;
    private String brand;
    private String model;
    private LocalDate regDate;
    
    public Car(int weight, String colour, int maxSpeed, String licensePlate, String brand, String model, LocalDate regDate) {
        setWeight(weight);
        setColour(colour);
        setMaxSpeed(maxSpeed);
        setLicensePlate(licensePlate);
        setBrand(brand);
        setModel(model);
        setRegDate(regDate);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegDate() {
        return regDate.toString();
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String printInfo() {
        StringBuilder print = new StringBuilder();

        print.append(getBrand() + " " + getModel() + "\t" + getLicensePlate() + "\n");
        print.append("Registration Date: " + getRegDate() + "\n");
        print.append("Colour: " + getColour() + "\n");
        print.append("Weight: " + getWeight() + "kg\n");
        print.append("Maximum Speed: " + getMaxSpeed() + "km/h\n");
        
        return print.toString();
    }




    
}
