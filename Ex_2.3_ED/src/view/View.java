package view;

import java.util.Random;

import javax.swing.JOptionPane;

import controller.controller;

public class View {
	public static void main(String[] args) {
		controller cont = new controller();
		Random random = new Random();

		int[] vt = new int[10];
		int tamanho = vt.length;
		boolean valido = false;

		while (valido != true) {
			for (int i = 0; i < tamanho; i++) {
				// vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
				vt[i] = random.nextInt(100);
				if (vt[i] != 0) {
					valido = true;
				} else {
					valido = false;
					JOptionPane.showMessageDialog(null, "Insira um número inteiro diferente de 0");
				}
			}
		}

		System.out.print("Vetor: ");
		for (int i : vt) {
			System.out.print(i + " ");
		}

		System.out.println("\nExistem " + cont.AcharPar(vt, tamanho - 1) + " números pares.");
	}
}