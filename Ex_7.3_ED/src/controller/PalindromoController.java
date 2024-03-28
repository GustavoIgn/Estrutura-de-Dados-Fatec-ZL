package controller;

import br.edu.fateczl.pilhaString.Pilha;

public class PalindromoController {

    public PalindromoController() {
        super();
    }

    public String invertePalavras(String palavra) {
        Pilha pilha = new Pilha();
        String palavraSemEspacos = palavra.replaceAll(" ", ""); // Remove espaços

        int tamanho = palavraSemEspacos.length();
        for (int i = 0; i < tamanho; i++) {
            pilha.push((palavraSemEspacos.substring(i, i + 1)));
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String letra;
        palavra = "";
        for (int i = 0; i < tamanho; i++) {
            try {
                letra = pilha.pop();
                palavra = palavra + letra;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return palavra;
    }

    public boolean comparaPalavras(String palavra, String palavraInvertida) {
        palavra = palavra.replaceAll(" ", ""); // Remove espaços
        palavraInvertida = palavraInvertida.replaceAll(" ", ""); // Remove espaços
        return palavra.equalsIgnoreCase(palavraInvertida);
    }
}
