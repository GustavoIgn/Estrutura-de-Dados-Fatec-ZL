package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class NPRController {

	public NPRController() {
		super();
	}

	public void insereValor(Pilha p, int valor) {
		p.push(valor);
	}

	public double npr(Pilha p, String op) throws Exception {
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			if (p.size() >= 2) {
				int v1 = p.pop();
				int v2 = p.pop();
				double result = 0;

				if (op.equals("+")) {
					result = v1 + v2;
				} else if (op.equals("-")) {
					result = v2 - v1;
				} else if (op.equals("*")) {
					result = v1 * v2;
				} else if (op.equals("/")) {
					if (v1 == 0) {
						throw new Exception("Divisão por zero");
					}
					result = (double) v2 / v1;
				}

				p.push((int) result);
				return result;
			} else {
				throw new Exception("Pilha com valores insuficientes");
			}
		} else {
			throw new Exception("Operação inválida");
		}
	}
}
