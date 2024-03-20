<<<<<<< HEAD
package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;

public class Controller {
	public Controller() {
		super();
	}

	public void ordenacao(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-MergeSort\n2-BubbleSort\n9-Finalizar"));
			switch (opc) {
			case 1:
				vt = ord.mergeSort(vt, 0, vt.length - 1);
				System.out.println("\nVetor Ordenado: ");
				for (int i : vt) {
					System.out.print(i + " ");
				}
				break;
			case 2:
				vt = ord.bubbleSort(vt);
				System.out.println("\nVetor Ordenado: ");
				for (int i : vt) {
					System.out.print(i + " ");
				}
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
=======
package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;

public class Controller {
	public Controller() {
		super();
	}

	public void ordenacao(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-MergeSort\n2-BubbleSort\n9-Finalizar"));
			switch (opc) {
			case 1:
				vt = ord.mergeSort(vt, 0, vt.length - 1);
				System.out.println("\nVetor Ordenado: ");
				for (int i : vt) {
					System.out.print(i + " ");
				}
				break;
			case 2:
				vt = ord.bubbleSort(vt);
				System.out.println("\nVetor Ordenado: ");
				for (int i : vt) {
					System.out.print(i + " ");
				}
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
