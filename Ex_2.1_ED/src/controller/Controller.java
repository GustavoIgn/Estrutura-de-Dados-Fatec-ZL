package controller;

public class Controller {

	public Controller() {
		super();
	}

	public int SomaMultiplica��o(int n1, int n2) {
		// Condi��o de Parada: o n�mero (B) multiplicado � reduzido, e quando atingir 1
		// deve retornar o valor de A para a soma prim�ria;
		if (n2 == 1) {
			return n1;
		} else {
			return n1 + SomaMultiplica��o(n1, --n2);			
		}
	}
}
