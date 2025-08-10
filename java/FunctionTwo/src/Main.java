import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV" , 1200.00));
        products.add(new Product("Televisao" , 1000.00));
        products.add(new Product("Computador" , 3000.00));
        products.add(new Product("HD" , 350.00));


        // meu jeito
        var ref = new Object() {
            double sum = 0.0;
        };
        List<Double> somadosT = products.stream()
                .filter(p -> p.getName().charAt(0) == 'H')
                .map(p -> ref.sum += p.getPrice())
                .toList();
        System.out.println(ref.sum);

        // jeito do curso

        ProductService productService = new ProductService();

        double sum = productService.filteredSum(products , p -> p.getName().charAt(0) == 'T');
        System.out.println(sum);

    }
}
