package view;

import javax.swing.JOptionPane;
import controller.Ex1Controller;

public class Ex1Principal {

	public static void main(String[] args) {
		Ex1Controller cont = new Ex1Controller();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N:"));
		
		int resultado = cont.SomaNaturais(n);
		System.out.println("A soma de " + n + " + seus primeiros números naturais é " + resultado + ".");
	}

}
