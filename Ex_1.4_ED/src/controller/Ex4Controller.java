package controller;

public class Ex4Controller {
	public Ex4Controller() {
		super();
	}

	public int ExibirTotalNegativos(int[] vt, int n) {
		// Condição de parada: Indicador (n) ser menor que 0, pois configura o vetor
		// como fora de alcance de suas posições.
		if (n < 0) {
			return 0;
		} else {
			// Conta e verifica o número atual como negativo, a cada número encontrado a
			// recursiva adiciona 1 na variável total.
			int totalNegativos = ExibirTotalNegativos(vt, n - 1);
			if (vt[n] < 0) {
				return 1 + totalNegativos;
			} else {
				return totalNegativos;
			}
		}
	}

}
