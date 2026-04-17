package class_ex4.vehicle.driver;

import class_ex4.vehicle.vehicle2.Bus;
import class_ex4.vehicle.vehicle2.Taxi;

public class DriverEx {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
    
}
