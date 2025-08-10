import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV" , 1200.00));
        products.add(new Product("Notebook" , 10000.00));
        products.add(new Product("Celular" , 3000.00));

        products.sort((p1 , p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) );

        for (Product product : products) {
            System.out.println(product);
        }

    }
}