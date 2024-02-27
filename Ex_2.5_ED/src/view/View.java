package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {
	public static void main(String[] args) {
		Controller cont = new Controller();

		boolean valido = false;
		
		while (valido != true) {
			int n1 =  Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
			int n2 =  Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
			if (n1 > 0 && n2 > 0) {
				valido = true;
				System.out.println("O MDC é " + cont.MDC(n1, n2));
			} else {
				System.out.println("Insira números positivos");
			}
		}
		

		
	}
}
