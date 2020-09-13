package shopProject.shopPackage;

public class Chemicals extends Product {

	public Chemicals() {
		super();
	}

	public Chemicals(String productName, int amount, double price) {
		super(productName, amount, price);
	}

	@Override
	public double discount() {
		int koef;
		if (getAmount() > 5) {
			koef = 4;
		} else
			koef = 1;

		return (getPrice() * (100 - koef) / 100);
	}

}
