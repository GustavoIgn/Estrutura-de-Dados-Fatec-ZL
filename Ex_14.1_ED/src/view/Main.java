package view;

import controller.ApartamentoController;
import javax.swing.JOptionPane;
import model.Morador;

public class Main {

    public static void main(String[] args) {
        ApartamentoController aptoCont = new ApartamentoController();

        int opc = 0;
        int nApto = 0;
        while (opc != 9) {
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Cadastrar Morador\n2- Consultar Morador\n3- Excluir Morador\n4- Listar Moradores por Andar\n9-Finalizar", "Menu", JOptionPane.INFORMATION_MESSAGE));
                switch (opc) {
                    case 1:
                        boolean valida = false;
                        while (valida != true) {
                            nApto = Integer.parseInt(JOptionPane.showInputDialog("Número do Apto?"));
                            valida = aptoCont.validaNApto(nApto);
                        }
                        String nomeMorador = JOptionPane.showInputDialog("Nome do Morador?");
                        String modeloCarro = JOptionPane.showInputDialog("Modelo do Carro?");
                        String corCarro = JOptionPane.showInputDialog("Cor do Carro?");
                        String placaCarro = JOptionPane.showInputDialog("Placa do Carro?");
                        aptoCont.cadastrarMorador(nApto, nomeMorador, modeloCarro, corCarro, placaCarro);
                        break;
                    case 2:
                        nApto = Integer.parseInt(JOptionPane.showInputDialog("Número do Apto para Pesquisa?"));
                        Morador m1 = new Morador(nApto, null, null, null, null);
                        m1 = aptoCont.consultaMorador(m1);
                        System.out.println(m1.toString());
                        break;
                    case 3:
                        nApto = Integer.parseInt(JOptionPane.showInputDialog("Número do Apto para Remocao?"));
                        Morador m2 = new Morador(nApto, null, null, null, null);
                        aptoCont.removeMorador(m2);
                        break;
                    case 4:
                        int andar = Integer.parseInt(JOptionPane.showInputDialog("Andar a ser Listado?"));
                        aptoCont.listarMoradoes(andar);
                        break;
                    case 9:
                        System.out.println("Programa Finalizado");
                        System.exit(0);
                    default:
                        System.out.println("Opção Inválida");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
