package ListaRevisão.GerenciadorCardapio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorOperacoes {
    private GerenciadorCardapio gerenciadorCardapio;

    public GerenciadorOperacoes(GerenciadorCardapio gerenciadorCardapio) {
        this.gerenciadorCardapio = gerenciadorCardapio;
    }

    public void adicionarPrato(Scanner entradaDoUsuario) {
        System.out.println("\nDigite o nome do prato:");
        String nome = entradaDoUsuario.next();

        List<String> ingredientes = new ArrayList<>();
        System.out.println("Digite os ingredientes do prato (digite 'pronto' para encerrar):");
        String ingrediente = entradaDoUsuario.next();
        while (!ingrediente.equalsIgnoreCase("pronto")) {
            ingredientes.add(ingrediente);
            ingrediente = entradaDoUsuario.next();
        }
        Prato prato = new Prato(nome, ingredientes);
        gerenciadorCardapio.adicionarPrato(prato);
        System.out.println("\nPrato adicionado com sucesso!");
    }

    public void exibirPratos() {
        List<Prato> pratos = gerenciadorCardapio.getPratos();
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato cadastrado.");
        } else {
            System.out.println("Pratos cadastrados:");
            for (Prato prato : pratos) {
                System.out.println("\nNome: " + prato.getNome());
                System.out.println("Ingredientes: " + prato.getIngredientes());
            }
        }
    }

    public void removerPrato(Scanner entradaDoUsuario) {
        System.out.println("\nDigite o nome do prato a ser excluído:");
        String nomePratoExcluir = entradaDoUsuario.next();

        gerenciadorCardapio.removerPrato(nomePratoExcluir);
        System.out.println("Prato removido com sucesso!");
        System.out.println();
    }
}


