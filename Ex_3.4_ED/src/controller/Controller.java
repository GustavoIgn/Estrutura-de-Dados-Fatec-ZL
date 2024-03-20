<<<<<<< HEAD
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public String ConverterBinario(int n) {
		// Condição de Parada: Após as divisões N se encontra como 0, logo devo retornar
		// colhendo os restos das divisões anteriores.
		if (n <= 0) {
			return "";
		} else {
			// A cada retorno eu concateno o valor do resto da divisão de n por 2, de forma
			// inversa, ou seja, na ordem de binário e passo o resultado da divisão de n por
			// 2 para a proxima volta.
			return String.valueOf(ConverterBinario(n / 2) + n % 2);
		}
	}
}
=======
package controller;

public class Controller {
	public Controller() {
		super();
	}

	public String ConverterBinario(int n) {
		// Condição de Parada: Após as divisões N se encontra como 0, logo devo retornar
		// colhendo os restos das divisões anteriores.
		if (n <= 0) {
			return "";
		} else {
			// A cada retorno eu concateno o valor do resto da divisão de n por 2, de forma
			// inversa, ou seja, na ordem de binário e passo o resultado da divisão de n por
			// 2 para a proxima volta.
			return String.valueOf(ConverterBinario(n / 2) + n % 2);
		}
	}
}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
