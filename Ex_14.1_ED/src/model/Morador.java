package model;

public class Morador {

    public int nApto;
    public String nomeMorador, modeloCarro, corCarro, placaCarro;

    public Morador(int nApto, String nMorador, String mCarro, String cCarro, String pCarro) {
        this.nApto = nApto;
        this.nomeMorador = nMorador;
        this.modeloCarro = mCarro;
        this.corCarro = cCarro;
        this.placaCarro = pCarro;
    }

    @Override
    public String toString() {
        return "[Morador= " + nomeMorador + " Apto= " + nApto + " Carro= " + modeloCarro + "]";
    }

    @Override
    public int hashCode() {
        int posicao = nApto / 100;
        return posicao;
    }

}
