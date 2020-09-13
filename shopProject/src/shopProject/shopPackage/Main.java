package shopProject.shopPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User seller1 = new User("Vanya", UserType.SELLER, "+375294564545", "vanya@mail.ru", "20/04/1985");
        User buyer1 = new User("Kostya",UserType.BUYER, "75292342323", "eee", "200/04/1985");

        seller1.checkUserInfo();
        buyer1.checkUserInfo();
        Deal deal1 = new Deal(seller1, buyer1);
        deal1.dealUserInfo();

        PieceProduct koffee = new PieceProduct("koffee", 5, 14.56);
        PieceProduct moloko = new PieceProduct("moloko", 2, 1.01);
        Chemicals shampoo = new Chemicals("shampoo", 1, 76);
        WeightProduct candy = new WeightProduct("snikers", 6.3, 3.3);
        PieceProduct donut = new PieceProduct("donuts", 30, 1.5);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(moloko);
        products.add(koffee);

        deal1.buyerBagInfo(products);
        deal1.addProduct(products, shampoo);
        deal1.addProduct(products, candy);
         deal1.makeDiscount(products);
        deal1.deleteProduct(products, moloko);
        deal1.makeDiscount(products);
        deal1.addProduct(products, donut);

    }
}
