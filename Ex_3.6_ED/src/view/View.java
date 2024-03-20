<<<<<<< HEAD
package view;

import javax.swing.JOptionPane;

import Controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

		System.out.println("Resultado da somatória: " + cont.calcSoma(n));
	}

}
=======
package view;

import javax.swing.JOptionPane;

import Controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

		System.out.println("Resultado da somatória: " + cont.calcSoma(n));
	}

}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
