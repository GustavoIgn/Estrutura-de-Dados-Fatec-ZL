package model;

public class Cliente {
	
	public int quantidadePecas;
	public float valorPecas;
	public String nome;
	
	public Cliente(String nome, int quantidadePecas, float valor) {
		this.nome = nome;
		this.quantidadePecas = quantidadePecas;
		this.valorPecas = valor;
	}
	
	@Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade de Peças: " + quantidadePecas + ", Valor Unitário da Peça: " + valorPecas;
    }
}
