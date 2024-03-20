package view;

import javax.swing.JOptionPane;
import controller.Controller;
public class View {

	public static void main(String[] args) {
		Controller cont = new Controller();
		String texto = JOptionPane.showInputDialog("Insira a cadeia de caracteres");
		int tamanho = texto.length();
		
		System.out.println("Invertendo " + texto + " fica " + cont.InverterTexto(texto, tamanho));

	}

}
