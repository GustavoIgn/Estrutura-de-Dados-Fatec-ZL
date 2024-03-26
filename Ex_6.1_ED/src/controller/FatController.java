package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	Pilha p = new Pilha();

	public FatController() {
		super();
	}

	public int fatorial(int n) {
		int fat = 1;
		int aux = n;
		while (aux >= 1) {
			if (p.isEmpty()) {
				p.push(n);
			}
			p.push(aux);
			int v1;
			try {
				v1 = p.pop();
				fat = fat * v1;
				aux--;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return fat;
	}
}
