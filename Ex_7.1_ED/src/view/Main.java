package view;

import controller.PilhaController;

public class Main {

	public static void main(String[] args) {
		int vt[] = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		PilhaController p = new PilhaController();
		p.pilhaPos(vt);
	}

}
