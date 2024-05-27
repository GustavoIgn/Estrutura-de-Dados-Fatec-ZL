package model;

public class Telefone {

    public String numero;
    public String nome;

    public Telefone(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int hashCode() {
        int num = Integer.parseInt(numero.substring(0, 2));
        int posicao = num - 11;
        return posicao;
    }
}
