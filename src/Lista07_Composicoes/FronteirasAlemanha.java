package Lista07_Composicoes;

import java.util.ArrayList;
import java.util.List;

public class FronteirasAlemanha {
    private List<Pais> fronteiras;

    public FronteirasAlemanha() {
        this.fronteiras = new ArrayList<>();
        inicializarFronteiras();
    }

    private void inicializarFronteiras() {
        fronteiras.add(new Pais(123, "França", 67406000, 543965));
        fronteiras.add(new Pais(456, "Áustria", 8917200, 83858));
        fronteiras.add(new Pais(789, "Polônia", 38386000, 312696));
        fronteiras.add(new Pais(321, "República Tcheca", 10640000, 78866));
        fronteiras.add(new Pais(654, "Suíça", 8570000, 41284));
        fronteiras.add(new Pais(987, "Holanda", 17445781, 41543));
        fronteiras.add(new Pais(741, "Bélgica", 11632334, 30528));
        fronteiras.add(new Pais(135, "Luxemburgo", 626108, 2586));
        fronteiras.add(new Pais(246, "Dinamarca", 5814461, 42923));

    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }
}