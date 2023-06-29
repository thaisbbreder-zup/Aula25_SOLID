package ListaRevisão.GerenciadorProdutos;

public class ExibirProdutos implements OperacaoProduto {
        @Override
        public void executar(GerenciadorProdutos gerenciador) {
                gerenciador.exibirProdutos();
        }
}