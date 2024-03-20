package controller;

public class Ex2Controller {
	public Ex2Controller() {
		super();
	}

	public int ProcurarMenor(int[] vt, int tamanho, int vlUltima) {
		// Condição de parada: tamanho atinge -1, ou seja, vetor encerrado, fora do dominio do vet.
		if (tamanho == -1) {
			return vlUltima;
		} else {
			// Busca do menor valor comparando as posições e efetuando a troca.
			if (vt[tamanho] < vlUltima) {
				vlUltima = vt[tamanho];
			}
			// Processo recursivo que diminui o limite de busca no vetor.
			return ProcurarMenor(vt, tamanho - 1, vlUltima);
		}
	}

}
