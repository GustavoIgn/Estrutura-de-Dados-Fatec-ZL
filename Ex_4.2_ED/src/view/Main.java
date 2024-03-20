<<<<<<< HEAD
package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller cont= new Controller();
		
		int [] vt = new int[1500];
		for (int i = 0; i < 1500 ; i++) {
			vt[i] = i - 1499;
		}
		
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Organizar Bubble\n2-Organizar Merge\n3-Organizar Quick\n9-Finalizar"));
			switch (opc) {
			case 1:
				cont.ordenaVetorBubble(vt);
				break;
			case 2:
				cont.ordenaVetorMerge(vt);
				break;
			case 3:
				cont.ordenaVetorQuick(vt);
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
package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller cont= new Controller();
		
		int [] vt = new int[1500];
		for (int i = 0; i < 1500 ; i++) {
			vt[i] = i - 1499;
		}
		
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Organizar Bubble\n2-Organizar Merge\n3-Organizar Quick\n9-Finalizar"));
			switch (opc) {
			case 1:
				cont.ordenaVetorBubble(vt);
				break;
			case 2:
				cont.ordenaVetorMerge(vt);
				break;
			case 3:
				cont.ordenaVetorQuick(vt);
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
