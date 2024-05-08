package view;

import controller.OperacaoController;
import model.Lista;

public class Main {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();

        lista.addFirst(16);
        lista.addFirst(7);
        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(6);
        lista.addFirst(7);
        lista.addFirst(9);
        lista.addFirst(12);
        lista.addFirst(8);
        lista.addFirst(5);
        lista.addFirst(3);
        
        OperacaoController opCont = new OperacaoController();
        
        opCont.maiorMaior(lista);
    }
}
