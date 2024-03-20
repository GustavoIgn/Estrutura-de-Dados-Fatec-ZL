<<<<<<< HEAD
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
=======
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
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
