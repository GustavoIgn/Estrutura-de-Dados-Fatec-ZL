package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.FilaObj;
import controller.FilaController;

public class Main {
	public static void main(String[] args) {
		FilaController fCont = new FilaController();
		FilaObj fila = new FilaObj();
		FilaObj filaPrioritarios = new FilaObj();
		int opc = 0, atendidos = 1;

		while (opc != 9) {
			try {
				opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1- Inserir Clientes Prioritario\n2- Inserir Cliente Regular\n3- Atendimento \n9- Finalizar"));

				switch (opc) {
				case 1:
					fCont.inserir(filaPrioritarios, 1);
					break;
				case 2:
					fCont.inserir(fila, 2);
					break;
				case 3:
					atendidos = fCont.atender(atendidos, fila, filaPrioritarios);
					break;
				case 9:
					System.out.println("Programa finalizado com sucesso!");
					break;
				default:
					System.out.println("Opção inválida!");
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
			}
		}
	}
}
