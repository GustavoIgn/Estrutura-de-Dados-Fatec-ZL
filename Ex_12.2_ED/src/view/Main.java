package view;

import controller.OperacoesController;
import model.Lista;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> a = new Lista<>();
        Lista<Integer> b = new Lista<>();
        Lista<Integer> i = new Lista<>();
        Lista<Integer> u = new Lista<>();

        a.addFirst(3);
        b.addFirst(9);
        try {
            a.addLast(5);
            a.addLast(8);
            a.addLast(12);
            a.addLast(9);
            a.addLast(7);
            b.addLast(6);
            b.addLast(2);
            b.addLast(3);
            b.addLast(7);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        OperacoesController opCont = new OperacoesController();
        
        System.out.println("Lista A: ");
        opCont.mostrarLista(a);
        
        System.out.println("Lista B: ");
        opCont.mostrarLista(b);
        
        i = opCont.interseccao(a, b, i);
        System.out.println("Lista I: ");
        opCont.mostrarLista(i);
        
        u = opCont.uniao(a, b, u);
        System.out.println("Lista U: ");
        opCont.mostrarLista(u);
        

    }
}
