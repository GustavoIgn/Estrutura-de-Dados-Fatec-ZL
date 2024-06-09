package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar.Arvore;

public class Main {

    public static void main(String[] args) {
        char vt[] = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

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
            
            System.out.println("\n||||||||||||||||||||Pós Remoção|||||||||||||||||||||");
            arvChar.remove('F');
            arvChar.remove('U');
            System.out.print("Prefix: ");
            arvChar.prefixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Infix: ");
            arvChar.infixSearch();
            System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.print("Postfix: ");
            arvChar.postfixSearch();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
