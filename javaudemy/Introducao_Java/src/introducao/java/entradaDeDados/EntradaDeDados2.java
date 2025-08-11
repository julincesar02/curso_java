package introducao.java.entradaDeDados;

import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {
        // aprendendo a ler varias entradas de dados até a quebra de linha
        Scanner sc = new Scanner(System.in);
        // OBS: se colocamos um valor de tipo primitivo como int , double ect... , devemos colocar uma proxima linha vazia
        String s1 , s2 , s3;
        double d ;
        d = sc.nextDouble();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados guardados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(d);
        sc.close();
    }
}
