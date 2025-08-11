import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv" , 1200.00));
        products.add(new Product("Computador" , 5000.00));
        products.add(new Product("HD" , 5.00));
        products.add(new Product("HD" , 100.00));
        products.add(new Product("HD" , 20.00));

        // Usando classe anônima
//        products.removeIf(new ProductPredicate());

        // Usando função anônima
//      products.removeIf(x -> x.getPrice() > 100);

        // Usando o jeito certo
//        products = products.stream()
//                .filter(x -> x.getPrice() <= 100)
//                .toList();

        Predicate<Product> productPredicate = (x -> x.getPrice() > 100);

        // Expressão lambda em inline (em uma linha)
        products.removeIf(x -> x.getPrice() > 100);

        products.forEach(System.out::println);
    }
}