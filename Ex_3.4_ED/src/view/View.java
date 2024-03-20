<<<<<<< HEAD
package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {
	public static void main(String[] args) {
		Controller cont = new Controller();
		boolean valido = false;
		while (valido != true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 0 e 2000"));
			if (n > 0 && n < 2000) {
				valido = true;
				System.out.println("Em binário " + n + " é " + cont.ConverterBinario(n));
			} else {
				valido = false;
				System.out.println("Insira um valor entre 0 e 2000");
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
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 0 e 2000"));
			if (n > 0 && n < 2000) {
				valido = true;
				System.out.println("Em binário " + n + " é " + cont.ConverterBinario(n));
			} else {
				valido = false;
				System.out.println("Insira um valor entre 0 e 2000");
			}
		}
		
		
		
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
