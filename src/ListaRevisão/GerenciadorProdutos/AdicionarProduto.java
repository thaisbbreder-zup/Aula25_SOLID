package ListaRevisão.GerenciadorProdutos;

public class AdicionarProduto implements OperacaoProduto {
    private String nome;
    private double preco;

    public AdicionarProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void executar(GerenciadorProdutos gerenciador) {
        gerenciador.adicionarProduto(nome, preco);
    }
}