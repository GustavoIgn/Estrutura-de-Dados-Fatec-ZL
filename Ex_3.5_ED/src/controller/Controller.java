<<<<<<< HEAD
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public int calcFibonacci(int n) {
		// Condição de Parada: Caso N seja menor que 2, ele retorna o próprio valor de
		// N, geralmente = 1.
		if (n < 2) {
			return n;
		} else {
			// A sequência soma n-1 com n-2 até o termo escolhido (n).
			return calcFibonacci(n - 1) + calcFibonacci(n - 2);
		}
	}
}
=======
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public int calcFibonacci(int n) {
		// Condição de Parada: Caso N seja menor que 2, ele retorna o próprio valor de
		// N, geralmente = 1.
		if (n < 2) {
			return n;
		} else {
			// A sequência soma n-1 com n-2 até o termo escolhido (n).
			return calcFibonacci(n - 1) + calcFibonacci(n - 2);
		}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
