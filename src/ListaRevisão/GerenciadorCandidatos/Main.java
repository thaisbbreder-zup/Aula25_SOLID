package ListaRevisão.GerenciadorCandidatos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorOperacoes gerenciador = new GerenciadorOperacoes();
        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcao;
        System.out.println(">>>> Gerencie os candidatos do vestibular!");
        do {
            System.out.println("\n----------------- MENU -----------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar candidato");
            System.out.println("2 - Exibir candidatos cadastrados");
            System.out.println("3 - Excluir candidato");
            System.out.println("0 - Sair");
            System.out.println("----------------------------------------");

            opcao = entradaDoUsuario.nextInt();

            switch (opcao) {
                case 1:
                    gerenciador.adicionarCandidato();
                    break;
                case 2:
                    gerenciador.exibirCandidatos();
                    break;
                case 3:
                    gerenciador.excluirCandidato();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }
}
