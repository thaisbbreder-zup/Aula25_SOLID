package ListaRevisão.GerenciadorCandidatos;

import java.util.Scanner;

public class GerenciadorOperacoes {
    private GereciadorCandidatos listaCandidatos;
    private Scanner entradaDoUsuario;

    public GerenciadorOperacoes() {
        listaCandidatos = new GereciadorCandidatos(); //cada instância de GerenciadorCandidatos terá sua própria instância de ListaCandidatos para gerenciar os candidatos
        entradaDoUsuario = new Scanner(System.in);
    }

    public void adicionarCandidato() {
        System.out.println("\nDigite o primeiro nome do candidato: ");
        String nome = entradaDoUsuario.next();
        System.out.println("Digite o número de matrícula do candidato:");
        int numMatricula = entradaDoUsuario.nextInt();
        System.out.println("Digite a nota do candidato:");
        double nota = entradaDoUsuario.nextDouble();

        Candidato candidato = new Candidato(nome, numMatricula, nota);
        listaCandidatos.adicionarCandidato(candidato);
    }

    public void excluirCandidato() {
        System.out.println("\nDigite o número de matrícula do candidato a ser excluído:");
        int matriculaExcluir = entradaDoUsuario.nextInt();

        listaCandidatos.excluirCandidato(matriculaExcluir);
    }

    public void exibirCandidatos() {
        listaCandidatos.exibirCandidatos();
    }
}