package view;

import controller.OperacoesController;
import model.Lista;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();
        int[] vt = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};
        lista.addFirst(1);
        try {
            lista.addLast(2);
            lista.addLast(6);
            lista.addLast(7);
            lista.addLast(8);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        OperacoesController opCont = new OperacoesController();
        
        System.out.println("Lista Original: ");
        opCont.mostrarLista(lista);
        
        lista = opCont.operacoes(lista, vt);
        
        System.out.println("Lista Final: ");
        opCont.mostrarLista(lista);
        
    }
}
