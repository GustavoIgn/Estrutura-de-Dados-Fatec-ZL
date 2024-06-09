package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.Arvore;

public class Main {

    public static void main(String[] args) {
        int vt[] = {12, 4, 16, 2, 8, 6};

        Arvore arvInt = new Arvore();
        for (int i : vt) {
            arvInt.insertLeaf(i);
        }

        try {
            System.out.println("Nível: ");
            arvInt.search(6);
            arvInt.remove(12);
            System.out.print("Postfix: ");
            arvInt.postfixSearch();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}
