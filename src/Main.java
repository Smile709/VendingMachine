import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new HotDrinks("BlackTea", 170, 150, 90));
        productList.add(new HotDrinks("BlackTea", 250, 300, 90));
        productList.add(new HotDrinks("GreenTea", 170, 150, 90));
        productList.add(new HotDrinks("GreenTea", 250, 300, 90));
        productList.add(new HotDrinks("Americano", 180, 150,80));
        productList.add(new HotDrinks("Americano", 260, 300,80));
        productList.add(new HotDrinks("Cappucino", 200, 150, 75));
        productList.add(new HotDrinks("Cappucino", 300, 300, 75));


        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("GreenTea", 150,90));
    }
}