package view;

import controller.ChocolateController;
import javax.swing.JOptionPane;
import model.Chocolate;

public class Main {

    public static void main(String[] args) {
        ChocolateController chocCont = new ChocolateController();

        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Adicionar Chocolate - Volume\n2- Calcular Tipo\n9- Finalizar", "MENU", JOptionPane.INFORMATION_MESSAGE));

            switch (opc) {
                case 1:
                    int volume = Integer.parseInt(JOptionPane.showInputDialog("Insira o volume do Chocolate"));
                    String tipo = JOptionPane.showInputDialog("Insira qual barra será usada");
                    chocCont.adicionarChocolate(new Chocolate(tipo, volume));
                    break;
                case 2:
                    chocCont.calcularTiposChocolates();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Opcao Inválida");
            }
        }
    }
}
