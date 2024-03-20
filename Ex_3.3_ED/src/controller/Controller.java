<<<<<<< HEAD
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public String InverterTexto(String txt, int tamanho) {
		// Condição de Parada: o tamanho da palavra ser igual a 0, significa que a
		// palavra é inexistente/acabou e retorna vazio.
		if (tamanho == 0) {
			return "";
		} else {
			String l = txt.substring(0, 1);
			tamanho = tamanho - 1;
			return InverterTexto(txt.substring(1), tamanho) + l;
			// A cada volta a String l pega a primeira letra da palavra, e quando retorna
			// ela retorna com uma letra a menor
		}
	}
}
=======
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public String InverterTexto(String txt, int tamanho) {
		// Condição de Parada: o tamanho da palavra ser igual a 0, significa que a
		// palavra é inexistente/acabou e retorna vazio.
		if (tamanho == 0) {
			return "";
		} else {
			String l = txt.substring(0, 1);
			tamanho = tamanho - 1;
			return InverterTexto(txt.substring(1), tamanho) + l;
			// A cada volta a String l pega a primeira letra da palavra, e quando retorna
			// ela retorna com uma letra a menor
		}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
