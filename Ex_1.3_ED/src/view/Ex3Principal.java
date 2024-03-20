package view;

import javax.swing.JOptionPane;

import controller.Ex3Controller;

public class Ex3Principal {
	public static void main(String[] args) {
		Ex3Controller cont = new Ex3Controller();
		boolean valido = false;
		while (valido != true) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N"));

			if (n >= 0 && n <= 12) {
				int resultado = cont.ExibirFatorial(n);
				System.out.println("O fatorial de " + n + " é: " + resultado);
				valido = true;
			} else {
				JOptionPane.showMessageDialog(null, ("Número fora do limite, por favor insira de 1 a 12"));
				valido = false;
			}
		}
	}
}
