package br.edu.fateczl.ordenacao;

public class MetodosOrdenacao {
	public MetodosOrdenacao() {
		super();
	}

	public int[] bubbleSort(int[] vt) {
		int tamanho = vt.length;
		for (int i = 0; i < tamanho; i++) {
			for (int j = i + 1; j < tamanho; j++) {
				if (vt[i] > vt[j]) {
					int aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		return vt;
	}

	public int[] mergeSort(int[] vt, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vt, inicio, meio);
			mergeSort(vt, meio + 1, fim);
			intercalar(vt, inicio, meio, fim);
		}
		return vt;
	}

	private void intercalar(int[] vt, int inicio, int meio, int fim) {
		int auxVt[] = new int[vt.length + 1];
		for (int i = inicio; i <= fim; i++) {
			auxVt[i] = vt[i];
		}

		int esq = inicio;
		int dir = meio + 1;

		for (int aux = inicio; aux <= fim; aux++) {
			if (esq > meio) {
				vt[aux] = auxVt[dir];
				dir++;
			} else if (dir > fim) {
				vt[aux] = auxVt[esq];
				esq++;
			} else if (auxVt[esq] < auxVt[dir]) {
				vt[aux] = auxVt[esq];
				esq++;
			} else {
				vt[aux] = auxVt[dir];
				dir++;
			}
		}
	}

	public int[] quickSort(int[] vt, int inicio, int fim) {
		if (fim > inicio) {
			int indPivo = separar(vt, inicio, fim);

			quickSort(vt, inicio, indPivo - 1);
			quickSort(vt, indPivo + 1, fim);
		}
		return vt;
	}

	private int separar(int[] vt, int inicio, int fim) {
		int pivo, pontEsq, pontDir = fim;
		pontEsq = inicio + 1;
		pivo = vt[inicio];

		while (pontEsq <= pontDir) {
			while (pontEsq <= pontDir && vt[pontEsq] <= pivo) {
				pontEsq++;
			}

			while (pontDir >= pontEsq && vt[pontDir] > pivo) {
				pontDir--;
			}

			if (pontEsq < pontDir) {
				trocar(vt, pontDir, pontEsq);
				pontEsq++;
				pontDir--;
			}
		}

		trocar(vt, inicio, pontDir);
		return pontDir;
	}

	private void trocar(int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}
