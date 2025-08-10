package introducao.java.EstruturaRepeticao;

import java.util.Scanner;

public class Estruturafor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números deseja: ");
        int number = input.nextInt();
        for (int i = 0; i < number + 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " É Par");
                System.out.println();
            }
            if (i % 2 == 1) {
                System.out.println(i + " É Impar");
                System.out.println();
            }
        }
    }
}
