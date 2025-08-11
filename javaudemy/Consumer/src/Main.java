import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV" , 1200.00));
        products.add(new Product("Notebook" , 3000.00));
        products.add(new Product("HD" , 350.00));

//        products.forEach(new PriceUpdate());
//
//        for (Product product : products) {
//            System.out.println(product.getName() + " " + String.format("%.2f",product.getPrice()));
//        }

        double aumento = 1.1;

        // expressão lambda declarada
        Consumer<Product> productConsumer = (x -> x.setPrice(x.getPrice() * aumento));
        // expressão lambda inline
        products.forEach(x -> x.setPrice(x.getPrice() * aumento));

        products.forEach(System.out::println);

    }
}