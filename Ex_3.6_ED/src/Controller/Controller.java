<<<<<<< HEAD
package Controller;

public class Controller {
	public Controller() {
		super();
	}

	public Double calcFatorial(int n) {
		// Condição de Parada: n = 1, retorna o fatorial, no caso 1.
		if (n == 1) {
			return 1.0;
		} else {
			// Multiplica o valor de N pelo seu antecessor, até 1.
			return n * calcFatorial(n - 1);
		}
	}

	public Double calcSoma(int n) {
		// Condição de Parada: Quando n for 1, retorna 1 para a soma da série.
		if (n == 1) {
			return 1.0;
		} else {
			// A cada volta é somado fatorial com n e seus antecessores.
			return 1 / calcFatorial(n) + calcSoma(n - 1);
		}
	}
}
=======
package Controller;

public class Controller {
	public Controller() {
		super();
	}

	public Double calcFatorial(int n) {
		// Condição de Parada: n = 1, retorna o fatorial, no caso 1.
		if (n == 1) {
			return 1.0;
		} else {
			// Multiplica o valor de N pelo seu antecessor, até 1.
			return n * calcFatorial(n - 1);
		}
	}

	public Double calcSoma(int n) {
		// Condição de Parada: Quando n for 1, retorna 1 para a soma da série.
		if (n == 1) {
			return 1.0;
		} else {
			// A cada volta é somado fatorial com n e seus antecessores.
			return 1 / calcFatorial(n) + calcSoma(n - 1);
		}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
