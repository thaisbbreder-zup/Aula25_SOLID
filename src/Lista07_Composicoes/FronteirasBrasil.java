package Lista07_Composicoes;

import java.util.ArrayList;
import java.util.List;

public class FronteirasBrasil {
    private List<Pais> fronteiras;

    public FronteirasBrasil() {
        this.fronteiras = new ArrayList<>();
        inicializarFronteiras();
    }

    private void inicializarFronteiras() {
        fronteiras.add(new Pais(18754, "Argentina", 45000000, 2780400));
        fronteiras.add(new Pais(67890, "Bolivia", 12080000, 1099000));
        fronteiras.add(new Pais(39830, "Colômbia", 50340000, 1141748));
        fronteiras.add(new Pais(40367, "Paraguai", 6800000, 406752));
        fronteiras.add(new Pais(51602, "Peru", 33000000, 1285216));
        fronteiras.add(new Pais(38260, "Uruguai", 3500000, 176215));
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }
}