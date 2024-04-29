package controller;

import model.Lista;

public class Operacoes {

    public Operacoes() {
        super();
    }

    public void mostrarLista(Lista<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            try {
                System.out.println(lista.get(i));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }

    public void inverter(Lista<Integer> lista) throws Exception {
        int[] vt = new int[lista.size()];
        int tamanho = lista.size();

        int pos = 0;
        while (!lista.isEmpty()) {
            vt[pos] = lista.get(0);
            lista.removeFirst();
            pos += 1;

        }

        pos = 0;
        for (int i = tamanho - 1; i >= 0; i--) {
            lista.add(vt[i], pos);
            pos += 1;
        }
    }

}
