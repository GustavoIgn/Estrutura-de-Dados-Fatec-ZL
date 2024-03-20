package controller;

public class Ex3Controller {
	public Ex3Controller() {
		super();
	}

	public int ExibirFatorial(int n) {
		// Condição de parada: Valor igual a 1, processo de fatoramento deve retornar.
		if (n == 1) {
			return 1;
		} else {
			// O valor de n será multiplicado pelo seu antecessor a cada passagem, até seu
			// antecessor/ele mesmo ser igual a 1.
			return n * ExibirFatorial(n - 1);
		}
	}

}
