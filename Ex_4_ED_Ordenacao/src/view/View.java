package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();

		int vt[] = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int vt2[] = {44, 43, 42, 41, 40, 39, 38};
		
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Organizar Vetor 1\n2-Organizar Vetor 2\n9-Finalizar"));
			switch (opc) {
			case 1:
				System.out.println("Vetor Escolhido: ");
				for (int i : vt) {
					System.out.print(i + " ");
				}
				cont.ordenacao(vt);
				break;
			case 2:
				System.out.println("Vetor Escolhido: ");
				for (int i : vt2) {
					System.out.print(i + " ");
				}
				cont.ordenacao(vt2);
				break;
			default:
				System.out.println("Opção Inválida");
			}
			
		}

	}

}
