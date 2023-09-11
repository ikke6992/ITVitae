import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import vehicle.Car;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();        
        Car car1 = new Car(1000, "Blue", 220, "A-123-BC", "Volvo", "V40", LocalDate.now());
        Car car2 = new Car(800, "Gray", 200, "X-789-YZ", "Suzuki", "Swift", LocalDate.now());
        cars.add(car1);
        cars.add(car2);

        Scanner scanner = new Scanner(System.in);
        boolean carFound = false;
        Pattern plateFormat1 = Pattern.compile("[A-Z]{1,3}-[0-9]{1,3}-[A-Z]{1,3}");
        Pattern plateFormat2 = Pattern.compile("[0-9]{1,3}-[A-Z]{1,3}-[0-9]{1,3}");

        while (!carFound) {

            System.out.println("Please insert your license plate: FORMAT X-111-XX");
            String licensePlate = scanner.nextLine();
            
            while(licensePlate.length() != 8 || (!plateFormat1.matcher(licensePlate).matches() && !plateFormat2.matcher(licensePlate).matches())) {
                System.out.println("Your input does not comply with the license plate format\n" 
                    + "Please insert your license plate: FORMAT X-111-XX");
                licensePlate = scanner.nextLine();
                if (licensePlate.length() == 0) {
                    scanner.close();
                    return;

                }
            }

            for (Car car : cars) {
                if(car.getLicensePlate().equals(licensePlate)) {
                    System.out.println(car.printInfo());
                    carFound = true;
                    break;
                }
            }

            if (!carFound) {
                System.out.println("This car was not found in the database");
            }
        }

        scanner.close();

    }

    
}