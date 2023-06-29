package Lista07_Composicoes;
import Lista07_Composicoes.ExibicaoDeInformacao;

public class Pais implements ExibicaoDeInformacao{
    private int codigoISO;
    private String nome;
    private double populacao;
    private double dimensao;



    public Pais(int codigoISO, String nome, double populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;

    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoesPais(){
        System.out.println("Nome: " + nome);
        System.out.println("Codigo ISO: " + codigoISO);
        System.out.println("População: " + populacao);
        System.out.println("Dimensão: " + dimensao);
    }
}