package view;

import javax.swing.JOptionPane;

import Controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();

		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B"));

		System.out.println("A divisão de " + n1 + " / " + n2 + " é " + cont.SubtraçãoDivisão(n1, n2));
		;

	}

}
