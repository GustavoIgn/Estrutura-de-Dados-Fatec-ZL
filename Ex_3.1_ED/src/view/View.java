package view;

import javax.swing.JOptionPane;
import controller.Controller;

public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
		
		System.out.println("O número " + n + " possui " +  cont.RetornaDigitos(n) + " dígito(s)");

	}

}
