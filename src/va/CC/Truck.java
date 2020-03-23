package va.CC;


public class Truck extends Car {

    public enum ROOF {COMPACTSPACE, CLASSICSPACE, STREAMSPACE, BIGSPACE, GIGASPACE}

    public enum SUSPENSION {STEEL, AIR}

    double tonnage;
    ROOF roof;
    SUSPENSION suspension;

    public Truck(String colour, String model, int maxSpeed, double basicPreis, Manufacturer manufacturer, Engine engine, double carMileage, Tank tank, double tonnage, ROOF roof, SUSPENSION suspension) {
        super(colour, model, maxSpeed, basicPreis, manufacturer, engine, carMileage, tank);
        this.tonnage = tonnage;
        this.roof = roof;
        this.suspension = suspension;
    }

    public void printTruck() {
        System.out.println("\nIm a " + manufacturer.getManufacturer() + " truck, model: " + this.model + " and can pull " + this.tonnage+" ton");
        System.out.println("\nI cost only "+ this.preiceAfterManufacturerDisccount()+" after discount");
    }
}
