package controller;

public class Controller {
	public Controller() {
		super();
	}
	
	public int Fatorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Fatorial(n - 2);
		}
	}
}
