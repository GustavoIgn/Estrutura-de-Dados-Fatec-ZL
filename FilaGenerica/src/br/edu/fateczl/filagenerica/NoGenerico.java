package br.edu.fateczl.filagenerica;

public class NoGenerico<T> {
    T dado;
    NoGenerico<T> proximo;
    
    @Override
    public String toString() {
        return "Dado: " + dado;
    }
}