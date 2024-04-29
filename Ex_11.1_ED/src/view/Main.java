package view;

import controller.Operacoes;
import model.Lista;

public class Main {

    public static void main(String[] args) throws Exception {
        Operacoes op = new Operacoes();
        Lista<Integer> lista = new Lista();

        lista.add(3, 0);
        lista.add(5, 1);
        lista.add(18, 2);
        lista.add(12, 3);
        lista.add(9, 4);
        lista.add(7, 5);
        lista.add(6, 6);
        lista.add(2, 7);
        lista.add(13, 8);
        lista.add(4, 9);
        lista.add(16, 10);

        System.out.println("Lista Original: ");
        op.mostrarLista(lista);

        op.inverter(lista);

        System.out.println("Lista Invertida: ");
        op.mostrarLista(lista);

    }
}
