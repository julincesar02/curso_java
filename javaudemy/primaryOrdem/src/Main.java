import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int compareProducts(Product p1 , Product p2){
        return -p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV" , 1200.00));
        products.add(new Product("HD" , 200.00));
        products.add(new Product("Computador" , 3300.00));


        // função de primeira ordem na programação isso e comum
        products.sort(Main::compareProducts);

        products.forEach(System.out::println);
    }
}