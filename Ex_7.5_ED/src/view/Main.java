package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaString.Pilha;
import controller.HistoricoController;

public class Main {

	public static void main(String[] args) {
		HistoricoController historico = new HistoricoController();
		Pilha p = new Pilha();
		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Menu\n1- Inserir Novo Endereço\n2- Remover Ultimo Endereço\n3- Verificar Ultimo Endereço\n9- Finalizar."));

			switch (opc) {
			case 1:
				historico.inserir(p);
				break;
			case 2:
				historico.remover(p);
				break;
			case 3:
				historico.verificar(p);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
