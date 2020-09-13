package shopProject.shopPackage;
@ProducerInfo(company = "China", name = "prodShop", number = 1, productTypes = { "bakaleia", "himia" })
public class Product {

    private String productName;
    private int amount;
    private double price;

    public Product() {
        super();
    }

    public Product(String productName, int amount, double price) {
        super();
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double oneprice() {
        return (price * amount);
    }

    public void productInfo() {
        System.out.println(productName + " * " + amount + " ( " + price + " for each one)");
    }

    public double discount() {
        int koef = 5;
        return (oneprice() * (100 - koef) / 100);
    }
}
