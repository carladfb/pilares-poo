package Interface.Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;
import Interface.Equipamentos.MultiFuncional.EquipamentoMultiFuncional;

public class Grafica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional multiFuncional = new EquipamentoMultiFuncional();

        Impressora impressora = multiFuncional;
        Digitalizadora digitalizadora = multiFuncional;
        Copiadora copiadora = multiFuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
