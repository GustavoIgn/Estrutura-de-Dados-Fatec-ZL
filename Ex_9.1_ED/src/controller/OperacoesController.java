package controller;

import br.edu.fateczl.filas.FilaObj;
import model.Cliente;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public void caixa(FilaObj fila) {
		while (!fila.isEmpty()) {
			Cliente cliente = new Cliente(null, 0, 0);
			try {
				cliente = (Cliente) fila.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			float valorTotal = cliente.valorPecas * cliente.quantidadePecas;

			System.out.println("Cliente: " + cliente.nome + " -- Valor Total: " + valorTotal);
		}

	}

}