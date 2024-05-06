package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lista;

public class OperacoesController {

    public void mostrarLista(Lista<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            try {
                System.out.println(lista.get(i));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public Lista<Integer> operacoes(Lista<Integer> lista, int[] vt) {
        for (int i : vt) {
            if (contem(i, lista)) {
                try {
                    lista.addLast(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (i % 2 == 0) {
                try {
                    lista.add(i, 2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    lista.add(i, 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        
        return lista;
    }

    private boolean contem(int posicao, Lista<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            try {
                if (lista.get(i).equals(posicao)) {
                    return true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return false;
    }

}
