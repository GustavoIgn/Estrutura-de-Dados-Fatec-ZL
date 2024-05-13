package controller;

import model.Chocolate;
import model.Lista;

public class ChocolateController {

    public Lista<Chocolate> chocolates;

    public ChocolateController() {
        this.chocolates = new Lista<>();
    }

    public void adicionarChocolate(Chocolate chocolate) {
        chocolates.addFirst(chocolate);
    }

    public String determinarTipoChocolate(double volume) {
        if (volume >= 50 && volume <= 60) {
            return "Bombom";
        } else if (volume >= 100 && volume <= 110) {
            return "Pavê";
        } else if (volume >= 150 && volume <= 165) {
            return "Brigadeiro";
        } else if (volume >= 200 && volume <= 220) {
            return "Bolo";
        } else if (volume >= 260 && volume <= 280) {
            return "Ovo de Páscoa";
        } else {
            return "Tipo de chocolate não reconhecido";
        }
    }

    public void calcularTiposChocolates() {
        int tamanho = chocolates.size();
        for (int i = 0; i < tamanho; i++) {
            try {
                Chocolate choc = chocolates.get(i);
                String tipo = determinarTipoChocolate(choc.getVolume());
                System.out.println("Chocolate com volume " + choc.getVolume() + " cm³ é para fazer " + tipo);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
