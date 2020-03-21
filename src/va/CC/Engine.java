package va.CC;

public class Engine {

    public enum FUELTYPE {DIESEL, GAS}

    private int horsePower;
    private FUELTYPE fueltype;
    double fuelConsumption;
    double engineMileage;

    public Engine(int horsePower, FUELTYPE fueltype, double fuelConsumption, double engineMileage) {
        this.horsePower = horsePower;
        this.fueltype = fueltype;
        this.fuelConsumption = fuelConsumption;
        this.engineMileage = engineMileage;
    }

    public int getHorsePower() {
        return horsePower;
    }

}
