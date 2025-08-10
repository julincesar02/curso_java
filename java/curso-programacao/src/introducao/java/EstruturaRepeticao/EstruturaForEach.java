package introducao.java.EstruturaRepeticao;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EstruturaForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.print("Digite a quantidade de nomes que deseja colocar: ");
        int quant = input.nextInt();
        for (int i = 0; i < quant + 1; i++) {
            nomes.add(input.nextLine());
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
