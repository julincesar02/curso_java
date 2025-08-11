package introducao.java.exercicios.For;

import java.util.Locale;
import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int quant = input.nextInt();
        for (int i = 0 ; i < quant ; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
