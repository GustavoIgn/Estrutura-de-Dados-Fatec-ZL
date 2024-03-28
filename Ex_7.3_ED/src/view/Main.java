package view;
import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Main {

    public static void main(String[] args) {
        PalindromoController controller = new PalindromoController();

        String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é um palíndromo:");
        String palavraInvertida = controller.invertePalavras(palavra);

        boolean resultado = controller.comparaPalavras(palavra, palavraInvertida);

        if (resultado) {
            System.out.println("A palavra ou frase \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra ou frase \"" + palavra + "\" não é um palíndromo.");
        }
    }
}
