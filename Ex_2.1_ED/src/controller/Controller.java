package controller;

public class Controller {

	public Controller() {
		super();
	}

	public int SomaMultiplicação(int n1, int n2) {
		// Condição de Parada: o número (B) multiplicado é reduzido, e quando atingir 1
		// deve retornar o valor de A para a soma prim�ria;
		if (n2 == 1) {
			return n1;
		} else {
			return n1 + SomaMultiplicação(n1, --n2);			
		}
	}
}
