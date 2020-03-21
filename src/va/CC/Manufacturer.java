package va.CC;

public class Manufacturer {

    public String manufacturer;
    public double discountPercentage;

    public Manufacturer(String manufacturer, double discountPercentage) {
        this.manufacturer = manufacturer;
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public String getManufacturer() {
        return manufacturer;
    }
}
