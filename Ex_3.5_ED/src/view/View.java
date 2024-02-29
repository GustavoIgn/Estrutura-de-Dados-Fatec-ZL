package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		boolean valido = false;

		while (valido != true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de 0 a 20"));
			if (n > 0 && n <= 20) {
				valido = true;
				System.out.println("O termo " + n + " da serie de Fibonacci é: " + cont.calcFibonacci(n));
			} else {
				valido = false;
			}
		}
	}

}
