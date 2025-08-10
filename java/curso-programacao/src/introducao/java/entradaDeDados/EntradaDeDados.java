package introducao.java.entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    /// Aprendendo a fazer entrada de dados via usuario
    public static void main(String[] args) {
        // iniciando um object do tipo scanner para ler entrada de dados
        Scanner sc =  new Scanner(System.in);

        char sexo;
        double salario;
        int idade;
        String nome;

        nome = sc.next();
        sexo = sc.next().charAt(0);
        idade = sc.nextInt();
        salario = sc.nextDouble();
        Locale.setDefault(Locale.US);
        System.out.printf("Nome: %s Sexo: %s idade: %d salario: %.2f" , nome , sexo , idade , salario);
        sc.close();

    }
}
