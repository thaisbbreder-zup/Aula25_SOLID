package ListaRevisão.GerenciadorProdutos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {

    protected List<Produto> produtos;

    public GerenciadorProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso com o valor de " + produto.getPreco() + "!");
    }

    public void excluirProduto (String nome){
        Produto produtoParaExcluir = null;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtoParaExcluir = produto;
                break;
            }
        }
        if (produtoParaExcluir != null) {
            produtos.remove(produtoParaExcluir);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto foi cadastrado.");
        } else {
            System.out.println("---------- Produtos cadastrados ----------");
            for (Produto produto : produtos) {
                System.out.println("\nNome: " + produto.getNome() + "\nPreço: " + produto.getPreco());
            }
        }
    }
    public void executarOperacao(OperacaoProduto operacao) {
        operacao.executar(this);
    }
}
