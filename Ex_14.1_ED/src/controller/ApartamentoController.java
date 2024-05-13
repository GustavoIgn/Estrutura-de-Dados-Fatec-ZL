package controller;

import model.Lista;
import model.Morador;

public class ApartamentoController {

    Lista[] tabelaHash;

    public ApartamentoController() {
        tabelaHash = new Lista[10];
        inicializar();
    }

    private void inicializar() {
        int tamanho = tabelaHash.length;
        for (int i = 0; i < tamanho; i++) {
            tabelaHash[i] = new Lista();
        }
    }

    public void cadastrarMorador(int nApto, String nomeMorador, String modeloCarro, String corCarro, String placaCarro) {
        Morador morador = new Morador(nApto, nomeMorador, modeloCarro, corCarro, placaCarro);
        int posicao = hash(nApto);
        if (tabelaHash[posicao].isEmpty()) {
            tabelaHash[posicao].addFirst(morador);
        } else {
            try {
                tabelaHash[posicao].addLast(morador);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public Morador consultaMorador(Morador morador) throws Exception {
        int posicao = morador.hashCode();
        int tamanhoLista = tabelaHash[posicao].size();

        for (int i = 0; i < tamanhoLista; i++) {
            try {
                Morador m = (Morador) tabelaHash[posicao].get(i);

                if (m.nApto == morador.nApto) {
                    morador.nomeMorador = m.nomeMorador;
                    morador.modeloCarro = m.modeloCarro;
                    morador.corCarro = m.corCarro;
                    morador.placaCarro = m.placaCarro;
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (morador.nomeMorador == null) {
            throw new Exception("Morador não cadastrado");
        }
        return morador;
    }

    public void removeMorador(Morador morador) throws Exception {
        int posicao = morador.hashCode();
        int tamanhoLista = tabelaHash[posicao].size();
        for (int i = 0; i < tamanhoLista; i++) {
            Morador m = (Morador) tabelaHash[posicao].get(i);

            if (m.nApto == morador.nApto) {
                tabelaHash[posicao].remove(i);
                break;
            }
        }
    }

    public void listarMoradoes(int andar) throws Exception {
        int posicao = andar;
        int tamanhoLista = tabelaHash[posicao].size();

        for (int i = 0; i < tamanhoLista; i++) {
            if (tabelaHash[posicao].isEmpty()) {
                System.err.println("NÂO CADASTRADO - SEM MORADORES");
            } else {
                Morador m = (Morador) tabelaHash[posicao].get(i);
                System.out.println(m.toString());
            }
        }
    }

    private int hash(int numero) {
        int posicao = numero / 100;
        return posicao;
    }

    public boolean validaNApto(int nApto) {
        if (nApto >= 100 && nApto <= 999) {
            int andar = nApto / 100;
            int numeroApto = nApto % 100;
            if (andar >= 1 && andar <= 9 && numeroApto >= 1 && numeroApto <= 5) {
                return true;
            } else {
                System.out.println("Número de apartamento inválido. Por favor, insira um número de apartamento válido (X01 a X05 (X -> 1 a 9).");
                return false;
            }
        } else {
            System.out.println("Número de apartamento inválido. Por favor, insira um número de apartamento válido (X01 a X05 (X -> 1 a 9).");
            return false;
        }
    }

}
