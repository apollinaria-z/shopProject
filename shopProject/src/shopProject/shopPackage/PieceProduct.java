package shopProject.shopPackage;

public class PieceProduct extends Product {

    public PieceProduct() {
        super();
    }

    public PieceProduct(String productName, int amount, double price) {
        super(productName, amount, price);
    }

    @Override
    public double discount() {
        int koef;
        if (getAmount() > 10) {
            koef = 3;
        } else
            koef = 0;

        return (getPrice() * (100 - koef) / 100);
    }
}
