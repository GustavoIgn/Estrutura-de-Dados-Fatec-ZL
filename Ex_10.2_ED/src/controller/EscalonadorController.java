package controller;

import model.Processo;
import br.edu.fateczl.filagenerica.FIlaGenerica;

public class EscalonadorController {

    public EscalonadorController() {
        super();
    }

    public FIlaGenerica escalonador(FIlaGenerica filaProcesso) {
        FIlaGenerica filaAux = new FIlaGenerica();
        while (!filaProcesso.isEmpty()) {
            try {
                Processo processo = (Processo) filaProcesso.remove();
                if (processo.qtdRetornos > 1) {
                    processo.qtdRetornos--;
                    filaAux.insert(processo);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return filaAux;
    }
}
