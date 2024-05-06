package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lista;

public class OperacoesController {

    public OperacoesController() {
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

    public Lista<Integer> interseccao(Lista<Integer> a, Lista<Integer> b, Lista<Integer> i) {
        for (int j = 0; j < a.size(); j++) {
            for (int k = 0; k < b.size(); k++) {
                try {
                    if (a.get(j) == b.get(k)) {
                        i.addFirst(a.get(j));
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }

        }
        return i;
    }

    public Lista<Integer> uniao(Lista<Integer> a, Lista<Integer> b, Lista<Integer> u) {
        for (int i = 0; i < a.size(); i++) {
            try {
                u.addFirst(a.get(i));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        
        for (int i = 0; i < b.size(); i++) {
            try {
                u.addFirst(b.get(i));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return u;
    }

}
