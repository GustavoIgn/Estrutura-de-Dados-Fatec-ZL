package controller;

public class Controller {
	public Controller() {
		super();
	}

	public int RetornaVezes(int n1, int n2) {
		// Condição de Parada: O número possuir apenas 1 digito e ser ou não igual ao
		// digito (n2) buscado.
		// O código funciona com a do número sem a ultima casa a cada iteração, e
		// adiciona 1 caso n2 seja encontrado.
		if (n1 < 10) {
			if (n1 == n2) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (n1 % 10 == n2) {
				return 1 + RetornaVezes(n1 / 10, n2);
			} else {
				return 0 + RetornaVezes(n1 / 10, n2);
			}
		}
	}
}
