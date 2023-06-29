package ListaRevisão.GerenciadorCardapio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorCardapio cardapio = new GerenciadorCardapio();
        GerenciadorOperacoes gerenciador = new GerenciadorOperacoes(cardapio);
        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcao;
        System.out.println("\n--------------- Bem vindo ao gerenciador de cardápio! ---------------");

        do {

            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Adicionar prato");
            System.out.println("2 - Exibir todos os pratos cadastrados");
            System.out.println("3 - Excluir um prato pelo nome");
            System.out.println("0 - Sair");

            opcao = entradaDoUsuario.nextInt();


                switch (opcao) {
                    case 1:
                        gerenciador.adicionarPrato(entradaDoUsuario);
                        break;
                    case 2:
                        gerenciador.exibirPratos();
                        break;
                    case 3:
                        gerenciador.removerPrato(entradaDoUsuario);
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        return;
                    default:
                        System.out.println("Opção inválida. Por favor, selecione novamente.");
                        System.out.println();
                        break;
                }
            } while (opcao != 0);
        }
    }

