package view;

import javax.swing.JOptionPane;

import controller.Ex5Controller;

public class Ex5Principal {
	public static void main(String[] args) {
		Ex5Controller cont = new Ex5Controller();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para N"));

		double resultado = cont.SomarSequencia(n);

		System.out.print("Resultado da série: 1 + ");

		for (int i = 2; i <= n; i++) {
			if (i == n) {
				System.out.print("1/" + i);
			} else {
				System.out.print("1/" + i + " + ");
			}
		}

		System.out.println("\n" + String.format("%.2f", resultado));

	}
}
