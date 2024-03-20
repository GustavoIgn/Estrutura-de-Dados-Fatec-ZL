package controller;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;

public class Controller {
	public Controller() {
		super();
	}

	public void ordenacao(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		vt = ord.quickSort(vt, 0, vt.length - 1);
		System.out.println("\nVetor Ordenado: ");
		for (int i : vt) {
			System.out.print(i + " ");
		}
	}
}
