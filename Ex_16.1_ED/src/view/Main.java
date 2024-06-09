package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;

public class Main {

    public static void main(String[] args) {
        int vt[] = {33, 15, 41, 38, 47, 34, 49, 43};

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
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
