package view;
import java.util.Random;

import controller.Ex2Controller;

public class Ex2Principal {
	public static void main(String[] args) {
		Ex2Controller cont = new Ex2Controller();
		Random random = new Random();
		int[] vt = new int[10];

		for(int i = 0; i < 10; i++) {
			vt[i] = random.nextInt(100);
		}
		
		int tamanho = vt.length;

		System.out.print("Vetor: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(vt[i] + "|");
		}
		
		if (tamanho > 0) {
			int menorValor = cont.ProcurarMenor(vt, tamanho - 1, vt[tamanho - 1]);
			System.out.println("\nO menor valor no vetor é: " + menorValor);
		} else {
			System.out.println("Vetor vazio. Não há menor valor.");
		}
	}
}
