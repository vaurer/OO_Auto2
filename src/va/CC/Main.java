package va.CC;

import static va.CC.Engine.FUELTYPE.DIESEL;
import static va.CC.Engine.FUELTYPE.GAS;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(385, GAS, 10.6, 0);
        Engine engine2 = new Engine(272, DIESEL, 7, 0);
        Tank tank1 = new Tank(75, 75);
        Tank tank2 = new Tank(650, 500);
        Manufacturer porsche = new Manufacturer("Porsche", 12.5);
        Manufacturer mercedes = new Manufacturer("Mercedes Benz", 9);
        Car car1 = new Car("Red", "911", 293, 126712, porsche, engine1, 0, tank1);
        Truck truck1 = new Truck("Silver", "Actros 2027", 160,165000, mercedes,  engine2,0, tank2, 20, Truck.ROOF.CLASSICSPACE, Truck.SUSPENSION.AIR);

        car1.printCar();
        System.out.println("Car price with manufacturer discount: EUR " + car1.preiceAfterManufacturerDisccount());
        car1.drive(49000);
        car1.drive(1500);
        car1.drive(100);
        truck1.printCar();
        System.out.println( truck1.engine.getHorsePower());
        truck1.printTruck();
        truck1.drive(500);
    }
}
