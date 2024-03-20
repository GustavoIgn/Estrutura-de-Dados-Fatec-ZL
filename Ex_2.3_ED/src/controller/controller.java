package controller;

public class controller {
	public controller() {
		super();
	}
	
	public int AcharPar(int[] vt, int tamanho) {
		//Condição de Parada: tamanho do vetor fora de limite
		if (tamanho == -1) {
			return 0;
		} else {
			//caso o valor seja par, ele soma 1 na função, e caso seja impar soma 0.
			if (vt[tamanho] % 2 == 0) {
				return 1 + AcharPar(vt, tamanho - 1);
			} else {
				return 0 + AcharPar(vt, tamanho - 1);
			}
		}
	}
}
