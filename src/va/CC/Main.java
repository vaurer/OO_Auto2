package va.CC;

import static va.CC.Engine.FUELTYPE.GAS;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(385, GAS, 10.6, 0);
        Manufacturer porsche = new Manufacturer("Porsche", 12.5);
        Car car1 = new Car("Red", "911", 293, 126712, porsche, engine1, 0);

        car1.printCar();
        System.out.println("Car price with manufacturer discount: EUR " + car1.preiceAfterManufacturerDisccount());
        car1.drive(49000);
        car1.drive(1500);
        car1.drive(100);
    }
}
