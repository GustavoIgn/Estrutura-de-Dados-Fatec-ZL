package model;

public class Telefone {

    public String numero;
    public String nome;

    public Telefone(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int hashCode() {
        int posicao;
        int num = Integer.parseInt(numero.substring(0, 2));
        if (num == 11) {
            return posicao = 11;
        } else {
            posicao = num - 11;
        }
        return posicao;
    }

    @Override
    public String toString() {
        return "Hash= " + hashCode() + " Numero= " + numero + " nome= " + nome;
    }

}
