package view;

import br.edu.fateczl.filas.FilaObj;
import controller.OperacoesController;
import model.Cliente;

public class Main {
	public static void main(String[] args) {
		OperacoesController fCont = new OperacoesController();
		FilaObj fila = new FilaObj();
		for (int i = 0; i < 20; i++) {
			String nome = "Cliente" + (i + 1);
			int quantPecas = (int) (Math.random() * 31 + 20);
			float valor = (float) (Math.random() * 95 + 5);
			Cliente clientes = new Cliente(nome, quantPecas, valor);
			fila.insert(clientes);
		}

		System.out.println("Clientes na fila: ");
		System.out.println(fila.toString());

		System.out.println("Passando no caixa: ");
		fCont.caixa(fila);
		System.out.println("Dia de trabalho concluido!!");
	}
}
