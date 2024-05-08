package controller;

import model.Lista;

public class OperacaoController {

    public OperacaoController() {
        super();
    }

    public void maiorMaior(Lista<Integer> lista) {
        try {
            int maior1 = 0;
            int maior2 = 0;

            for (int i = 0; i < lista.size(); i++) {
                int valor = lista.get(i);
                if (valor > maior1) {
                    maior2 = maior1;
                    maior1 = valor;
                } else if (valor > maior2 && valor != maior1) {
                    maior2 = valor;
                }
            }
            System.out.println("Maior 1: " + maior1 + "\nMaior 2: " + maior2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
