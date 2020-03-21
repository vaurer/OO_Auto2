package va.CC;

public class Car {
    public String colour;
    public int maxSpeed;
    public double basicPrice;
    public double carMileage;
    public Tank tank;

    String model;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String colour, String model, int maxSpeed, double basicPreis, Manufacturer manufacturer, Engine engine, double carMileage, Tank tank) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPreis;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.model = model;
        this.carMileage = carMileage;
        this.tank = tank;
    }

    public void printCar() {
        System.out.println("Manufacturer: " + manufacturer.getManufacturer() + "\nModel: " + model + "\nHorse power: " + engine.getHorsePower() + "\nFuel consumption: " + engine.fuelConsumption + "\nPrice : EUR " + basicPrice);
    }

    public double preiceAfterManufacturerDisccount() {
        return Math.round(basicPrice / 100) * (100 - manufacturer.getDiscountPercentage());
    }

    public void drive(double mile) {
        double numberOfFillUps;
        int fillUps = 0;
        if (engine.engineMileage < 50000) {
            engine.fuelConsumption = engine.fuelConsumption;
        } else {
            engine.fuelConsumption = (engine.fuelConsumption / 100) * 109.8;
        }
        carMileage += mile;
        engine.engineMileage += mile;
        double driveConsumption = (mile / 100) * engine.fuelConsumption;
        if (tank.fuelQuantity <= driveConsumption) {
            numberOfFillUps = driveConsumption / tank.tankCapacity;
            fillUps = (int) numberOfFillUps;
            tank.fuelQuantity = numberOfFillUps - fillUps;

        } else {
            tank.fuelQuantity = tank.fuelQuantity - driveConsumption;
        }
        System.out.println("\nIm driving... " + mile + " KM" + "\nCar mileage: " + carMileage + "\nMotor mileage: " + engine.engineMileage + "\nFuel consumption: " + driveConsumption + "\nFuel consumption per 100/KM: " + engine.fuelConsumption + "\nFuel left: " + Math.round(tank.fuelQuantity));
        System.out.println("Fill ups: " + fillUps);
    }


}
