package view;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import controller.ParqueController;
import model.Pessoa;

public class Main {

    public static void main(String[] args) {
        FIlaGenerica pessoas = new FIlaGenerica();
        ParqueController parque = new ParqueController();

        for (int i = 0; i < 30; i++) {
            String nome = "Pessoa" + (i + 1);
            int idade = (int) ((Math.random() * 31) + 10);
            double altura = (Math.random() * 66) + 135;
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas.insert(pessoa);
        }
        
        while (!pessoas.isEmpty()) {
            parque.brinquedo(pessoas);
        }

    }

}
