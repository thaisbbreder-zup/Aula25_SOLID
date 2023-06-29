package ListaRevisão.GerenciadorCandidatos;

import java.util.ArrayList;
import java.util.List;

public class GereciadorCandidatos {
    private List<Candidato> candidatos;

    public GereciadorCandidatos() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
        System.out.println("O candidato " + candidato.getNomeCandidato() + " foi adicionado com sucesso.");
    }

    public void excluirCandidato(int numMatricula) {
        Candidato candidatoExcluir = null;
        for (Candidato candidato : candidatos) {
            if (candidato.getNumMatricula() == numMatricula) {
                candidatoExcluir = candidato;
                break;
            }
        }
        if (candidatoExcluir != null) {
            candidatos.remove(candidatoExcluir);
            System.out.println("O candidato foi removido.");
        } else {
            System.out.println("O candidato não foi encontrado.");
        }
    }

    public void exibirCandidatos() {
        if (candidatos.isEmpty()) {
            System.out.println("Nenhum candidato foi cadastrado.");
        } else {
            System.out.println("---------- Candidatos cadastrados ----------");
            for (Candidato candidato : candidatos) {
                System.out.println("\nNome: " + candidato.getNomeCandidato() + "\nNúmero de matrícula: " + candidato.getNumMatricula() + "\nNota: " + candidato.getNota());
            }
        }
    }

}