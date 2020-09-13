package shopProject.shopPackage;

public class WeightProduct extends Product {

    private double kilo;

    public WeightProduct() {
        super();
    }

    public WeightProduct(String productName, double kilo, double price) {
        super(productName, price);
        this.kilo = kilo;

    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    @Override
    public double oneprice() {
        return (getPrice() * kilo);
    }

    @Override
    public void productInfo() {
        System.out.println(getProductName() + " " + kilo + " kg ( " + getPrice() + " per 1 kg)");
    }

    @Override
    public double discount() {
        int koef;
        if (kilo < 5.5) {
            koef = 3;
        } else if ((kilo >= 5.5) && (kilo < 10)) {
            koef = 5;
        } else
            koef = 8;

        return (getPrice() * (100 - koef) / 100);
    }

}
