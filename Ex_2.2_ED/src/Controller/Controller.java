package Controller;

public class Controller {
	public Controller() {
		super();
	}

	public int Subtra��oDivis�o(int n1, int n2) {
		// Condi��o de Parada: o n�mero (B) divisor � reduzido, e quando for menor que A
		// deve retornar o valor de A para a subtra��o prim�ria;
		if (n1 < n2 ) {
			return n1;
		} else {
			return Subtra��oDivis�o(n1 - n2, n2);
		}

	}

}
