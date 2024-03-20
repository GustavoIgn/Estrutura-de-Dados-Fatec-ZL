package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {
	public static void main(String[] args) {
		Controller cont = new Controller();
		boolean valido = false;
		
		while (valido != true) {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor de 10 a 9999999"));
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor de 0 a 10"));
			
			if ((n1 >= 10 && n1 <= 999999) && (n2 >= 0 && n2 <= 10)) {
				valido = true;
				System.out.println("O número " + n2 + " aparece " + cont.RetornaVezes(n1, n2) + " vez(es) em " + n1);
			} else {
				valido = false;
			}
		}
		
		
	}
}
