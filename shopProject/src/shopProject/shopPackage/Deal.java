package shopProject.shopPackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Deal {

    private User seller;
    private User buyer;
    private int productsAll;
    private ArrayList<Product> buyerBag;
    private Date deadline;
   

    public Deal() {
        super();
    }

    public Deal(User seller, User buyer) {
        super();
        this.seller = seller;
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public int getProductsAll() {
        return productsAll;
    }

    public void setProductsAll(int productsAll) {
        this.productsAll = productsAll;
    }

    public ArrayList<Product> getBuyerBag() {
        return buyerBag;
    }

    public void setBuyerBag(ArrayList<Product> buyerBag) {
        this.buyerBag = buyerBag;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void countDeadLine() {
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_MONTH, 10);
        this.deadline = c.getTime();
    }

    public void dealUserInfo() {
        countDeadLine();
        String s = seller.getName();
        String b = buyer.getName();
        System.out.println("Deal between " + s + " and " + b
        		+ ".\nSeller is <" + s + ">, buyer is <" + b
                + "> (deal deadline - " + deadline + ")");
    }

    public void buyerBagInfo(ArrayList<Product> products) {
        System.out.println("The products are: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).productInfo();
        }
        countPriceAll(products);
    }

    public void countPriceAll(ArrayList<Product> products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.oneprice();
        }
        System.out.println(buyer.getName() + " need to pay " + sum + " $.");
    }

    public void makeDiscount(ArrayList<Product> products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.discount();
        }
        System.out.println("A bill with discount is " + sum + " $");
    }

    public void deleteProduct(ArrayList<Product> products, Product prod) {
        products.remove(prod);
		System.out.println("-you deleted " + prod.getProductName() + " from bill-");
        System.out.println("-NEW BILL-");
        buyerBagInfo(products);
    }

    public void addProduct(ArrayList<Product> products, Product prod) {
        System.out.println("-you added " + prod.getProductName() + " to bill-");
        products.add(prod);
        buyerBagInfo(products);
    }

}
