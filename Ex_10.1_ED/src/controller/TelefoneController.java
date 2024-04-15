package controller;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelefoneController {

    public TelefoneController() {
        super();
    }

    public void insereLigacao(FIlaGenerica fila, String numeroTelefone) {
        fila.insert(numeroTelefone);
    }

    public void consultaLigacoes(FIlaGenerica fila) {
        try {
            System.out.println("Ultima Ligação: " + fila.remove());
        } catch (Exception ex) {
           System.out.println("Nenhuma Ligação Realizada.");
        }
    }
}
