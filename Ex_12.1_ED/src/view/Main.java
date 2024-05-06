package view;

import controller.OrdemController;
import model.Lista;

public class Main {
	public static void main(String[] args) {
		OrdemController ord = new OrdemController();
		Lista<Integer> lista = new Lista<Integer>();
		
		try {
			lista.add(10, 0);
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(1);
			lista.addLast(9);
			lista.addLast(2);
			lista.addLast(4);
			lista.addLast(7);
			lista.addLast(3);
			lista.addLast(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ord.ordem(lista);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
