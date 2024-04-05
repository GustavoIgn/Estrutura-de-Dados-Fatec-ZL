package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.FilaObj;
import model.Clientes;

public class FilaController {

	public FilaController() {
		super();
	}

	public void inserir(FilaObj tipoFila, int tipo) {
		String nome = JOptionPane.showInputDialog("Insira o Nome do Cliente");
		int num = (int) (Math.random() * 150 + 2);
		Clientes clientes = new Clientes(nome, num);
		tipoFila.insert(clientes);

		if (tipo == 1) {
			System.out.println("Cliente prioritário " + clientes.nome + " id: " + clientes.numero + " inserido com sucesso!");
		} else {
			System.out.println("Cliente regular " + clientes.nome + " id: " + clientes.numero + " inserido com sucesso!");
		}

	}

	public int atender(int atendidos, FilaObj fila, FilaObj filaPrioritarios) {
		Clientes clientes = new Clientes(null, 0);
		if (!filaPrioritarios.isEmpty() && atendidos <= 3) {
			atendidos++;
			try {
				clientes = (Clientes) filaPrioritarios.remove();
				System.out.println(clientes.nome + " id: " + clientes.numero + " está sendo atendido.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			atendidos = 0;
			try {
				clientes = (Clientes) fila.remove();
				System.out.println(clientes.nome + " id: " + clientes.numero + " está sendo atendido.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return atendidos;

	}

}