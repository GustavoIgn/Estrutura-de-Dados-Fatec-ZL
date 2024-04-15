package view;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import controller.TelefoneController;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String args[]) {
        int opc = 0;
        TelefoneController telCont = new TelefoneController();
        FIlaGenerica fila = new FIlaGenerica();
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1- Inserir Novo Numero\n2- Consultar Chamadas Perdidas\n9- Finalizar"));
            switch (opc) {
                case 1:
                    String numeroTelefone = JOptionPane.showInputDialog("Insira o número de Telefone:");
                    telCont.insereLigacao(fila, numeroTelefone);
                    break;
                case 2:
                    telCont.consultaLigacoes(fila);
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Opção Inexistente!!");
            }

        }

    }
}
