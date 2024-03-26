package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = 0;
		FatController fat = new FatController();

		boolean valido = false;
		while (!valido) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N"));
			if (n > 0 && n <= 10) {
				valido = true;
			}
		}
		System.out.println("O fatorial de " + n + " é " + fat.fatorial(n));
	}
}