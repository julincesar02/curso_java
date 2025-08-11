import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Product , Double> stock = new HashMap<>();

        Product pd1 = new Product("Tv" , 9000.00);
        Product pd2 = new Product("Celular" , 3000.00);
        Product pd3 = new Product("Motor de carro" , 800.00);
        stock.put(pd1 , 1000.00);
        stock.put(pd2 , 3000.00);
        stock.put(pd3 , 5000.00);

        Product ps = new Product("Tv" , 9000.00);
        System.out.println("Contêm a váriavel igual " + pd1.getName() + " : " + stock.containsKey(ps));
    }
}
