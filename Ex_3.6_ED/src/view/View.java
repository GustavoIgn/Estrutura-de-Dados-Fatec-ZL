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
