package view;

import java.util.Random;

import javax.swing.JOptionPane;

import controller.Ex4Controller;

public class Ex4Principal {
	public static void main(String[] args) {
		Ex4Controller cont = new Ex4Controller();
		Random random = new Random();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições terá o vetor?"));
		int[] vt = new int[n];

		// Usúario escolhe a quantidade de casas do vetor, e após isso o programa
		// aleatoriza números para preenche-lo, define o range de -100 até 100;
		for (int i = 0; i < n; i++) {
			vt[i] = random.nextInt(-100, 100);
		}
		
		int resultado = cont.ExibirTotalNegativos(vt, n - 1);
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(vt[i] + "|");
		}
		
		System.out.println("\nTotal de negativos no vetor: " + resultado);

	}
}
