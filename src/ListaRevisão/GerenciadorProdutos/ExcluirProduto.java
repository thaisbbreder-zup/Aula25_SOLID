package ListaRevisão.GerenciadorProdutos;

public class ExcluirProduto implements OperacaoProduto {
    private String nome;

    public ExcluirProduto(String nome) {
        this.nome = nome;
    }

    @Override
    public void executar(GerenciadorProdutos gerenciador) {
        gerenciador.excluirProduto(nome);
    }
}

