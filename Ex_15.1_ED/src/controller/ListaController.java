package controller;

import model.Lista;
import model.Telefone;

public class ListaController {

    Lista<Object>[] tabelaTelefone;

    public ListaController() {
        tabelaTelefone = new Lista[89];
    }

    public void inicializarLista() {
        int tamanho = tabelaTelefone.length;
        for (int i = 0; i < tamanho; i++) {
            tabelaTelefone[i] = new Lista();
        }
    }

    public void adicionarNumero(Telefone LT) {
        int posicao = LT.hashCode();
        tabelaTelefone[posicao].addFirst(LT);
    }

    public void listarNumeros() throws Exception {
        int tamanho = tabelaTelefone.length;
        for (int i = 0; i < tamanho; i++) {
            int tamanho2 = tabelaTelefone[i].size();
            for (int j = 0; j < tamanho2; j++) {
                Telefone LTA = (Telefone) tabelaTelefone[i].get(j);
                System.out.println(LTA.toString());
            }
        }

    }

}
