package controller;

import br.edu.fateczl.pilhaString.Pilha;

public class PilhaController {

	Pilha p = new Pilha();
	Pilha pAux = new Pilha();

	public PilhaController() {
		super();
	}

	public void inserir() {
		p.push("J");
		p.push("G");
		p.push("R");
		p.push("B");
		p.push("H");
		p.push("L");
		p.push("W");
	}

	public void exibir() {
		while (!p.isEmpty()) {
			try {
				String item = p.pop();
				if (item == "R") {
					pAux.push(item);
				} else if (item == "W") {
					pAux.push(item);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		p.push("L");
		p.push("B");
		p.push("M");
		p.push("G");
		p.push("K");

		while (!pAux.isEmpty()) {
			try {
				System.out.print(pAux.pop() + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
