package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.Arvore;

public class Main {

    public static void main(String[] args) {
        char vt[] = {'k', 'm', 'd', 'b', 'f', 'c', 'l', 't', 'p', 'z', 'r'};

        Arvore arvChar = new Arvore();
        for (char i : vt) {
            arvChar.insertLeaf(i);
        }

        try {
            System.out.print("Prefix: ");
            arvChar.prefixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Infix: ");
            arvChar.infixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Postfix: ");
            arvChar.postfixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            arvChar.search('r');
            
            
            System.out.println("\n||||||||||||||||||||Pós Remoção|||||||||||||||||||||");
            arvChar.remove('m');
            System.out.print("Prefix: ");
            arvChar.prefixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Infix: ");
            arvChar.infixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Postfix: ");
            arvChar.postfixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            arvChar.search('r');
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
