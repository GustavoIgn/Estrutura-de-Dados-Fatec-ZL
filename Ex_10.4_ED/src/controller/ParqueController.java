package controller;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import model.Pessoa;

public class ParqueController {

    public ParqueController() {
        super();
    }

    public void brinquedo(FIlaGenerica pessoas) {
        try {
            Pessoa pessoa = (Pessoa) pessoas.remove();

            if (pessoa.idade < 16 && pessoa.altura < 160) {
                System.out.println(pessoa.nome + " NÃO pode utilizar o brinquedo, Altura: " + String.format("%.2f", pessoa.altura)+ "cm -- Idade: " + pessoa.idade);
            } else if (pessoa.altura < 160) {
                System.out.println(pessoa.nome + "  NÃO pode utilizar o brinquedo, Altura: " + String.format("%.2f", pessoa.altura) + "cm");
            } else if (pessoa.idade < 16) {
                System.out.println(pessoa.nome + " NÃO pode utilizar o brinquedo, Idade: " + pessoa.idade);
            } else {
                System.out.println(pessoa.nome + " LIBERADO, bom passeio!");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
