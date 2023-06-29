package ListaRevisão.GerenciadorCandidatos;

public class Candidato {
    private String nomeCandidato;
    private int numMatricula;
    private double nota;

    public Candidato(String nomeCandidato, int numMatricula, double nota) {
        this.nomeCandidato = nomeCandidato;
        this.numMatricula = numMatricula;
        this.nota = nota;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
