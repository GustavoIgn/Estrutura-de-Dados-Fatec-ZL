package view;

import controller.ListaController;
import javax.swing.JOptionPane;
import model.Telefone;

public class Main {

    public static void main(String[] args) throws Exception {

        ListaController listCont = new ListaController();
        String[] vetorNumero = {
            "6078347269",
            "9888443460",
            "7310764414",
            "5989530974",
            "8997788712",
            "9916036955",
            "5425612994",
            "5964693077",
            "1160723572",
            "8349857059"
        };
        String[] vetorNome = {
            "João",
            "Maria",
            "Pedro",
            "Ana",
            "Carlos",
            "Juliana",
            "Lucas",
            "Mariana",
            "Paula",
            "Rafael"
        };

        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Lista\n 1 - Adicionar Número \n 2 - Listar Números\n 9 - Finalizar Programa "));
            switch (opc) {
                case 1:
                    int tamanhoNome = vetorNome.length;
                    listCont.inicializarLista();
                    for (int i = 0; i < tamanhoNome; i++) {
                        Telefone tel = new Telefone(vetorNumero[i], vetorNome[i]);
                        listCont.adicionarNumero(tel);
                    }
                    JOptionPane.showMessageDialog(null, "Lista telefonica inserida com sucesso!. ");
                    break;
                case 2:
                    listCont.listarNumeros();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!!");
            }

        }

    }

}
