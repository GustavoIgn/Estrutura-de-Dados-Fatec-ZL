package view;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import javax.swing.JOptionPane;
import controller.ImpressoraController;

public class Main {

    public static void main(String[] args) {

        FIlaGenerica documentos = new FIlaGenerica();
        ImpressoraController impressora = new ImpressoraController();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("IMPRESSÃO \n1- Insira documentos \n2- Imprimir\n9- Fechar"));
            switch (opc) {
                case 1:
                    String entrada = JOptionPane.showInputDialog("Digite o documento (ID_PC;Nome_Arquivo):");

                    if (entrada.matches("^[0-9]+;.*$")) {
                        impressora.insereDocumento(documentos, entrada);
                    } else {
                        JOptionPane.showMessageDialog(null, "Formato inválido!");
                    }
                    break;
                case 2:
                    impressora.imprime(documentos);
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!!");
                    break;
            }
        }
    }

}
