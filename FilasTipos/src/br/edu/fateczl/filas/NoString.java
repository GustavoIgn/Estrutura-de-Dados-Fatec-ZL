package br.edu.fateczl.filas;

public class NoString {
	String dado;
	NoString proximo;
	
	@Override
	public String toString() {
		return "Dado: " + dado;
	}
}
