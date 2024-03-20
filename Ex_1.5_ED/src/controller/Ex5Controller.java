package controller;

public class Ex5Controller {
	public Ex5Controller() {
		super();
	}

	public double SomarSequencia(int n) {
		// Condição de parada: n menor que 1, pois a divisão se tornaria por 0 dando
		// erro no programa.
		if (n == 1) {
			return 1.0;
		} else {
			return 1.0 / n + SomarSequencia(n-1);
			// Inicia com 1/n, somando e reduzindo 1 de n até n se tornar 1, ou seja, 1/1.
		}
	}
}