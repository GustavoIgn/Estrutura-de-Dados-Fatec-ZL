package Controller;

public class Controller {
	public Controller() {
		super();
	}

	public int SubtraçãoDivisão(int n1, int n2) {
		// Condição de Parada: o número (B) divisor é reduzido, e quando for menor que A
		// deve retornar o valor de A para a subtração prim�ria;
		if (n1 < n2 ) {
			return n1;
		} else {
			return SubtraçãoDivisão(n1 - n2, n2);
		}

	}

}
