package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaString.Pilha;

public class HistoricoController {

    public HistoricoController() {
        super();
    }

	public void inserir(Pilha p) {
		boolean valido = false;
		while (!valido) {
			String historico = JOptionPane.showInputDialog("Insira um endereço valido");
            if (historico.startsWith("http://") && historico.matches("http://www\\..+\\.(com)")) {
                p.push(historico);
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Endereço inválido! Tente novamente.");
            }
		}
		
	}

	public void remover(Pilha p) {
		if (p.isEmpty()) {
			System.err.println("Pilha Vazia");
		} else {
			try {
				p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public void verificar(Pilha p) {
		if (p.isEmpty()) {
			System.err.println("Pilha Vazia");
		} else {
			try {
				System.out.println("Ultimo endereço acessado: " + p.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
