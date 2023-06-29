package ListaRevisão.GerenciadorProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcao;
        System.out.println("\n>>>> Bem vindo ao Gerenciador de Produtos!");
        do {
            System.out.println("\n----------------- MENU -----------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Exibir produtos cadastrados");
            System.out.println("3 - Excluir produto");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");

            opcao = entradaDoUsuario.nextInt();

            OperacaoProduto operacao = null;

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do produto: ");
                    String nome = entradaDoUsuario.next();
                    System.out.println("Digite o preço do produto");
                    double preco = entradaDoUsuario.nextDouble();
                    operacao = new AdicionarProduto(nome, preco);
                    break;
                case 2:
                    operacao = new ExibirProdutos();
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser excluído:");
                    String nomeProdutoExcluir = entradaDoUsuario.next();
                    operacao = new ExcluirProduto(nomeProdutoExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (operacao != null) {
                gerenciador.executarOperacao(operacao);
            }
        } while (opcao != 0);
    }
}
