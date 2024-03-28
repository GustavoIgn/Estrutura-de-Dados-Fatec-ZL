package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class PilhaController {

	Pilha p = new Pilha();
	private int v1, v2;

	public PilhaController() {
		super();
	}

	public void pilhaPos(int[] vt) {
		int tamanho = vt.length;
		for (int i = 0; i < tamanho; i++) {
			if (vt[i] >= 0) {
				p.push(vt[i]);
			} else if (vt[i] < 0) {
				try {
					v1 = p.pop();
					v2 = p.pop();
					p.push(vt[i]);
					p.push(v1 + v2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(p.size());
	}
}
