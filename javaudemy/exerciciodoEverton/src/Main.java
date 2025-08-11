import entities.Cliente;
import entities.Endereco;
import entities.Pedido;
import entities.Produto;
import enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        Endereco ed1 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");
        Endereco ed2 = new Endereco("Rua das palmeiras", "123", "Centro", "São Paulo");
        Endereco ed3 = new Endereco("Avenida Brasil", "4567", "Jardim America", "Rio de Janeiro");
        Endereco ed4 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");
        Endereco ed5 = new Endereco("Manoel fernandes lima", "15A", "Lavras", "Minas Gerais");

        List<Produto> produtos = new ArrayList<>();
        Produto pd1 = new Produto(15, "Tv", 1500.0, 5);
        produtos.add(pd1);
        Produto pd2 = new Produto(1, "Notebook", 1900.0, 2);
        produtos.add(pd2);
        Produto pd3 = new Produto(19, "Tv Tubo", 1100.0, 4);
        produtos.add(pd3);
        Produto pd4 = new Produto(11, "Quadro", 1200.0, 1);
        produtos.add(pd4);
        Produto pd5 = new Produto(32, "Mesa", 1000.0, 4);
        produtos.add(pd5);
        Produto pd6 = new Produto(123, "Bolo", 1200.0, 6);
        produtos.add(pd6);

        Cliente c1 = new Cliente(19, "Julio", "julio@gmail.com", 3000.00);
        Cliente c2 = new Cliente(11, "Jander", "jander@gmail.com", 2000.00);
        Cliente c3 = new Cliente(16, "Matheus", "matheus@gmail.com", 1000.00);
        Cliente c4 = new Cliente(20, "Nicolas", "nicolas@gmail.com", 5000.00);
        Cliente c5 = new Cliente(1, "Ricardin", "ricardin@gmail.com", 4000.00);

        List<Pedido> pedidos = new ArrayList<>();
        Pedido pdd1 = new Pedido(1, c1, ed1, StatusPedido.ATRASADO);
        Pedido pdd2 = new Pedido(2, c2, ed2, StatusPedido.AGUARDANDO_ENVIO);
        Pedido pdd3 = new Pedido(3, c3, ed3, StatusPedido.EM_ANDAMENTO);
        Pedido pdd4 = new Pedido(4, c4, ed4, StatusPedido.ENTREGUE);
        Pedido pdd5 = new Pedido(5, c5, ed5, StatusPedido.ATRASADO);
        pedidos.add(pdd1);
        pedidos.add(pdd2);
        pedidos.add(pdd3);
        pedidos.add(pdd4);
        pedidos.add(pdd5);

        int id;
        while (true) {
            System.out.println("'Pedidos'");
            for (Pedido pedido : pedidos) {
                System.out.println("ID: "+pedido.getId() + " Cliente: " + pedido.getCliente().getNome());
            }

            System.out.println("[1] Buscar um ID: ");
            System.out.println("[2] Ver o valor total: ");
            System.out.println("[3] Ver status de pedido: ");
            System.out.println("[4] Comprar produto para um ID: ");
            System.out.print("Opção: ");
            int opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o id do pedido: ");
                id = input.nextInt();
                for (Pedido pedido : pedidos) {
                    if (id == pedido.getId()) {
                        System.out.println(pedido.getCliente());
                        System.out.println(pedido.getEndereco());
                        System.out.println("Status do pedido: " + pedido.getStatus());
                        System.out.println("Valor total: " + pedido.valorTotal());

                    }
                }
            }
            if (opcao == 2) {
                System.out.println("Digite ID: ");
                id = input.nextInt();
                for (Pedido pedido : pedidos) {
                    if (id == pedido.getId()) {
                        System.out.println("Cliente: " + pedido.getCliente().getNome());
                        System.out.printf("Valor total do cliente %s é '%.2f' %n", pedido.getCliente().getNome(), pedido.valorTotal());
                    }
                }
            }
            if (opcao == 3) {
                System.out.println("""
                        Quais tipos de status dos pedidos que você quer ver?\
                        
                        [AGUARDANDO_ENVIO]
                        [EM_ANDAMENTO]
                        [ATRASADO]
                        [ENTREGUE]""");
                System.out.print("Digite o status: ");
                String status = input.next();
                StatusPedido statusPedido = StatusPedido.valueOf(status.toUpperCase());
                for (Pedido pedido : pedidos) {
                    if (statusPedido == pedido.getStatus()) {
                        System.out.println("Cliente: " + pedido.getCliente().getNome());
                        System.out.println("Status do pedido: " + pedido.getStatus());
                        System.out.println();
                    }
                }
            }
            if (opcao == 4) {
                for (Produto produto : produtos) {
                    System.out.println("ID: " + produto.getId() + " nome: " + produto.getNome() + " estoque " + produto.getEstoque());
                }
                System.out.print("Digite o ID do produto que deseja: ");
                int idproduto = input.nextInt();
                Produto pddSolucitado = null;
                for (Produto produto : produtos) {
                    if (idproduto == produto.getId()) {
                        pddSolucitado = produto;
                    }
                }
                if (pddSolucitado == null){
                    System.out.println("ID inexistante.");
                } else if (pddSolucitado.getEstoque() <= 0) {
                    System.out.println("Não houve estoque");
                } else {
                    System.out.println("Digite o ID do pedido: ");
                    id = input.nextInt();
                    for (Pedido pedido : pedidos) {
                        if (id == pedido.getId()) {
                            pedido.addProduto(pddSolucitado);
                        }
                    }
                }

            }
        }
    }
}

lista = [1,2,3,4,5];

novalista = lista.filter(l -> l <= 3);