package introducao.java.EstruturaRepeticao;

// No curso pede para pegar um papel e caneta e tentar adivinhar o resultado que vai dar.
public class Tabela_Mesa {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        while (x > 2){
            System.out.println(x);
            y += x;
            x -= 1;
        }
    }
}
