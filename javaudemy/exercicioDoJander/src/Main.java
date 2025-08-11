import entities.Cliente;
import entities.Endereco;
import entities.Pedido;
import entities.Produto;
import enums.StaatusPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Cliente c = new Cliente(15 , "Julio" , "julio@gmail.com");
//
//        System.out.println(c.getId() + c.getNome() + c.getEmail());
//
//        Endereco ed = new Endereco("Manoel fernandes lima" , "15A" , "Lavras" , "Minas Gerais");
//
//        System.out.println(ed.getRua() + ed.getNumero() + ed.getCidade() + ed.getEstado());
//
//        Produto pd = new Produto(15 , "Tv" , 1200.0);
//
//        System.out.println(pd.getId() + pd.getNome() + pd.getPrice());
//        Pedido pdd = new Pedido(15, c , ed , null);
//        pdd.addProduto(pd);
        Endereco ed1 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");
        Endereco ed2 = new Endereco("Rua das palmeiras", "123", "Centro", "São Paulo");
        Endereco ed3 = new Endereco("Avenida Brasil", "4567", "Jardim America", "Rio de Janeiro");
        Endereco ed4 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");
        Endereco ed5 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");


        Cliente c1 = new Cliente(19, "Julio", "julio@gmail.com", 3000.00);
        Cliente c2 = new Cliente(11, "Jander", "jander@gmail.com", 2000.00);
        Cliente c3 = new Cliente(16, "Matheus", "matheus@gmail.com", 1000.00);
        Cliente c4 = new Cliente(20, "Nicolas", "nicolas@gmail.com", 5000.00);
        Cliente c5 = new Cliente(1, "Ricardin", "ricardin@gmail.com", 4000.00);

        Produto pd1 = new Produto(15, "Tv", 1500.0);
        Produto pd2 = new Produto(1, "Notebook", 1900.0);
        Produto pd3 = new Produto(19, "Tv Tubo", 1100.0);
        Produto pd4 = new Produto(11, "Quadro", 1200.0);
        Produto pd5 = new Produto(32, "Mesa", 1000.0);
        Produto pd6 = new Produto(100, "Bolo", 1200.0);

        List<Pedido> pedidos = new ArrayList<>();
        Pedido pdd1 = new Pedido(10, c1, ed1, StaatusPedido.ATRASADO);
        Pedido pdd2 = new Pedido(19, c2, ed2, StaatusPedido.AGUARDANDO_ENVIO);
        Pedido pdd3 = new Pedido(12, c3, ed3, StaatusPedido.EM_ANDAMENTO);
        Pedido pdd4 = new Pedido(13, c4, ed4, StaatusPedido.ENTREGUE);
        Pedido pdd5 = new Pedido(15, c5, ed5, StaatusPedido.ATRASADO);
        pedidos.add(pdd1);
        pedidos.add(pdd2);
        pedidos.add(pdd3);
        pedidos.add(pdd4);
        pedidos.add(pdd5);
        int id;
        while (true) {
            System.out.print("Qual ID de pedido deseja buscar? ");
            id = input.nextInt();
            for (Pedido pedido : pedidos) {
                if (id == pedido.getId()) {
                    System.out.println(pedido.getCliente());
                    System.out.println(pedido.getEndereco());
                    System.out.println("Status do pedido: " + pedido.getStatus());
                    System.out.println("Valor total dos produtos vendidos: " + pedido.valorTotal());
                }
            }
            System.out.println();
            System.out.print("Qual pedido você deseja ver o valor total 'ID': ");
            id = input.nextInt();
            for (Pedido pedido : pedidos) {
                if (id == pedido.getId()) {
                    System.out.println("Cliente: " + pedido.getCliente().getNome());
                    System.out.println("Valor total: " + pedido.valorTotal());
                }
            }
            System.out.println();
            System.out.println("""
                    Quais tipos de status dos pedidos que você quer ver?\
                    
                    [AGUARDANDO_ENVIO]
                    [EM_ANDAMENTO]
                    [ATRASADO]
                    [ENTREGUE]""");
            System.out.print("Digite o status: ");
            String status = input.next();
            StaatusPedido staatusPedido = StaatusPedido.valueOf(status.toUpperCase());
            for (Pedido pedido : pedidos) {
                if (staatusPedido == pedido.getStatus()) {
                    System.out.println("Cliente: " + pedido.getCliente().getNome());
                    System.out.println("Status do pedido: " + pedido.getStatus());
                    System.out.println();
                }
            }
            System.out.println("");


            System.out.println("Deseja continuar: [S/N] ");
            char respt = input.next().charAt(0);
            if (respt == 'n' || respt == 'N') {
                break;
            }
        }
        System.out.println("--Fim do programa--");
        input.close();
    }
}


//Agora o produto tem quantidade e vc vai ter que fazer um programa para o cliente comprar um produto, e se passar da quantidade de produtos
// não seja possivel realizar compra
