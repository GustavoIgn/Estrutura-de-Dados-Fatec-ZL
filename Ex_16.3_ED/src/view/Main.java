package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;

public class Main {

    public static void main(String[] args) {
        int vt[] = {7, 8, 3, 4, 2, 1, 6, 5};

        Arvore arvInt = new Arvore();
        for (int i : vt) {
            arvInt.insertLeaf(i);
        }

        try {
            System.out.print("Prefix: ");
            arvInt.prefixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Infix: ");
            arvInt.infixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Postfix: ");
            arvInt.postfixSearch();
            
            System.out.println("\n||||||||||||||||||||Pós Remoção|||||||||||||||||||||");
            arvInt.remove(7);
            arvInt.remove(6);
            System.out.print("Prefix: ");
            arvInt.prefixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Infix: ");
            arvInt.infixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Postfix: ");
            arvInt.postfixSearch();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
