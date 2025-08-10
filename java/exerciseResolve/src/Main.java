import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o caminho: ");
        String path = input.nextLine();
        BufferedReader bw = new BufferedReader(new FileReader(path));

        List<Product> products = new ArrayList<>();
        String line = bw.readLine();
        while (line != null){
            String[] fields = line.split(",");
            products.add(new Product(fields[0] , Double.parseDouble(fields[1])));
            line = bw.readLine();
        }
        double avg = products.stream()
                .map(Product::getPrice)
                .reduce(0.0 , Double::sum) / products.size();
        System.out.println("Media: " + String.format("%.2f",avg));

        List<String> nomes = products.stream()
                .filter(p -> p.getPrice() < avg)
                .map(Product::getName)
                .sorted((p1 , p2) -> -p1.toUpperCase().compareTo(p2.toUpperCase())).toList();

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}