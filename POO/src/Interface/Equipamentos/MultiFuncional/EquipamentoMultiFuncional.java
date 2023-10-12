package Interface.Equipamentos.MultiFuncional;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

}
