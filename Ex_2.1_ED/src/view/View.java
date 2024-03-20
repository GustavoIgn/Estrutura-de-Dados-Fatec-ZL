package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class View {

	public static void main(String[] args) {

		Controller cont = new Controller();
		int n1, n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		
		System.out.println("A multiplicação de " + n1 + " * " + n2  + " é " +cont.SomaMultiplicação(n1, n2));

	}

}