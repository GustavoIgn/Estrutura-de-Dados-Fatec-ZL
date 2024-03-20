package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		boolean valido = false;

		while (valido != true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

			if (n % 2 == 0 && n > 0) {
				System.out.println("Insira um valor impar positivo");
			} else {
				System.out.println("O fatorial duplo de " + n + " é " + cont.Fatorial(n));
				valido = true;
			}
		}
	}

}
