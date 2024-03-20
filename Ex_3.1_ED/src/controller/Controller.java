<<<<<<< HEAD
package controller;

public class Controller {
	public Controller() {
		super();
	}
	
	public int RetornaDigitos(int n) {
		// Condição de Parada: Número com apenas um digito.
			if (n < 10) {
				return 1;
			} else {
				//Número com pelo menos dois digitos, então somo 1 e faço a recursiva para o próximo digito.
				return 1 + RetornaDigitos(n/10);
			}
	}
}
=======
package controller;

public class Controller {
	public Controller() {
		super();
	}
	
	public int RetornaDigitos(int n) {
		// Condição de Parada: Número com apenas um digito.
			if (n < 10) {
				return 1;
			} else {
				//Número com pelo menos dois digitos, então somo 1 e faço a recursiva para o próximo digito.
				return 1 + RetornaDigitos(n/10);
			}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
