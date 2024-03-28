package view;

import java.util.Scanner;

import br.edu.fateczl.pilhaint.Pilha;
import controller.NPRController;

public class Main {
	public static void main(String[] args) {
		NPRController cont = new NPRController();
		Pilha p = new Pilha();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Digite um número ou operação (+ - * /) ou digite b para sair: ");
			String input = scanner.nextLine();

			if (input.equals("b")) {
				System.out.println("Finalizando...\nFIM");
				break;
			}

			try {
				int valor = Integer.parseInt(input);
				cont.insereValor(p, valor);
			} catch (NumberFormatException e) {
				try {
					System.out.println("Resultado: " + cont.npr(p, input));
				} catch (Exception ex) {
					System.out.println("Erro: " + ex.getMessage());
				}
			}

		}

		scanner.close();
	}
}
