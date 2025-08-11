import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV" , 1200.00));
        products.add(new Product("Computador" , 3000.00));
        products.add(new Product("HD" , 350.00));

        List<Double> numbersveses = products.stream().map(p ->  p.getPrice() * 10).toList();

        numbersveses.forEach(System.out::println);

    }
}