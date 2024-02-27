package controller;

public class Controller {
	public Controller() {
		super();
	}

	public int MDC(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return MDC (b, (a % b));
		}
	}
}
