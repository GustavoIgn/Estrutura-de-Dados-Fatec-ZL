package br.edu.fateczl.filas;

public class NoObj {
	Object dado;
	NoObj proximo;
	
	@Override
	public String toString() {
		return "Dado: " + dado;
	}
}
