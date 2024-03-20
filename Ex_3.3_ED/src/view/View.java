<<<<<<< HEAD
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
=======
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
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
