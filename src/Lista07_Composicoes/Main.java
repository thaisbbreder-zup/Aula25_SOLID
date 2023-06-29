package Lista07_Composicoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FronteirasBrasil fronteirasBrasil = new FronteirasBrasil();
        FronteirasAlemanha fronteirasAlemanha = new FronteirasAlemanha();

        boolean respostaCorreta = false;
        Pais paisEncontrado = null;
        String respostaFronteira;
        String paisEscolhido = "";

        System.out.println("Lista de países:");
        System.out.println("1 p/ Brasil");
        System.out.println("2 p/ Alemanha");

        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("Escolha um país para jogar o `Descubra a fronteira`!");
        int opcao = entradaDoUsuario.nextInt();

        switch (opcao) {
            case 1:
                paisEscolhido = "o Brasil";
                System.out.print("Digite o nome de um país que faz fronteira com o Brasil: ");
               respostaFronteira = entradaDoUsuario.next();

                for (Pais pais : fronteirasBrasil.getFronteiras()) {
                    if (pais.getNome().equalsIgnoreCase(respostaFronteira)) {
                        respostaCorreta = true;
                        paisEncontrado = pais;
                    }
                }
                break;
            case 2:
                paisEscolhido = "a Alemanha";
                System.out.print("Digite o nome de um país que faz fronteira com a Alemanha: ");
                respostaFronteira = entradaDoUsuario.next();

                for (Pais pais : fronteirasAlemanha.getFronteiras()) {
                    if (pais.getNome().equalsIgnoreCase(respostaFronteira)) {
                        respostaCorreta = true;
                        paisEncontrado = pais;
                    }
                }
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        if (respostaCorreta) {
            System.out.println("\nParabéns, você acertou! O país " + paisEncontrado.getNome() + " faz fronteira com "+ paisEscolhido);
            paisEncontrado.exibirInformacoesPais();
        } else {
            System.out.println("Que pena, você errou. O país " + paisEncontrado.getNome() + " não faz fronteira com " + paisEscolhido);
        }
    }
}
