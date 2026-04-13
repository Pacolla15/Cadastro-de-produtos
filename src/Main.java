import model.Produto;
import service.ProdutoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Mostrar produto");
            System.out.println("3 - Adicionar estoque");
            System.out.println("4 - Remover estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoria: ");
                    String cat = sc.nextLine();

                    Produto p = new Produto(nome, preco, qtd, cat);
                    service.cadastrar(p);

                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    service.mostrar();
                    break;

                case 3:
                    if(service.getProduto() != null) {
                        System.out.print("Quantidade a adicionar: ");
                        int add = sc.nextInt();
                        service.getProduto().adicionarEstoque(add);
                    } else {
                        System.out.println("Cadastre um produto primeiro.");
                    }
                    break;

                case 4:
                    if(service.getProduto() != null) {
                        System.out.print("Quantidade a remover: ");
                        int rem = sc.nextInt();
                        service.getProduto().removerEstoque(rem);
                    } else {
                        System.out.println("Cadastre um produto primeiro.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while(opcao != 0);

        sc.close();
    }
}