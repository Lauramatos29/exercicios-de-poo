package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Vestido", 5, 10.00);
		
		Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Consultar estoque");
            System.out.println("3- Vender produto");
            System.out.println("4- Sair");
            System.out.print("Digite a opção desejada: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número entre 1 e 4.");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
              
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.next();
  
                    break;
                case 2:
                    
                    estoque.consultarEstoque(produto1);
                    break;
                case 3:
                   
                    System.out.println("Digite o nome do produto a ser vendido:");
                    String nomeVender = scanner.next();
                    System.out.println("Digite a quantidade:");
                    int quantidade = scanner.nextInt();
                    estoque.venderProduto(nomeVender, quantidade);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
	}
}


