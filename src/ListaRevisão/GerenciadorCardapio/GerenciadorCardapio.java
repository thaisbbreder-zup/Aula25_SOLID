package ListaRevisão.GerenciadorCardapio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCardapio {
        private List<Prato> pratos;

        public GerenciadorCardapio() {
            pratos = new ArrayList<>();
        }

        public void adicionarPrato(Prato prato) {
            pratos.add(prato);
        }

        public List<Prato> getPratos() {
            return pratos;
        }

    public void removerPrato(String nome) {
        for (Prato prato : pratos) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                pratos.remove(prato);
                break;
            }
        }
    }
}