package va.CC;

public class Car {
    public String colour;
    public int maxSpeed;
    public double basicPrice;
    public double carMileage;

    String model;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String colour, String model, int maxSpeed, double basicPreis, Manufacturer manufacturer, Engine engine, double carMileage) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.basicPrice = basicPreis;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.model = model;
        this.carMileage = carMileage;
    }

    public void printCar() {
        System.out.println("Manufacturer: " + manufacturer.getManufacturer() + "\nModel: " + model + "\nHorse power: " + engine.getHorsePower() + "\nFuel consumption: " + engine.fuelConsumption + "\nPrice : EUR " + basicPrice);
    }

    public double preiceAfterManufacturerDisccount() {
        return Math.round (basicPrice/100)*(100-manufacturer.getDiscountPercentage());
    }

    public void drive(double mile){
        if(engine.engineMileage<50000){
            engine.fuelConsumption=engine.fuelConsumption;
        }
        else {
            engine.fuelConsumption = (engine.fuelConsumption/100)*109.8;
        }
    carMileage += mile;
    engine.engineMileage += mile;
    double driveConsumption= (mile/100)*engine.fuelConsumption;
        System.out.println("\nIm driving..."+mile+"KM"+"\nCar mileage: "+ carMileage+"\nMotor mileage: "+engine.engineMileage+"\nFuel consumption: "+driveConsumption+"\nFuel consumption per 100/KM: "+engine.fuelConsumption);
    }
}
