package model;

public class Chocolate {

    public String tipo;
    public double volume;

    public Chocolate(String tipo, double volume) {
        this.tipo = tipo;
        this.volume = volume;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVolume() {
        return volume;
    }
}
