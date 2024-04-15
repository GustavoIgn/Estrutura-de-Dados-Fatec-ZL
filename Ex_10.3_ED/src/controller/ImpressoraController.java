package controller;

import br.edu.fateczl.filagenerica.FIlaGenerica;
import model.Documento;

public class ImpressoraController {

    public ImpressoraController() {
        super();
    }

    public void insereDocumento(FIlaGenerica documentos, String entrada) {
        String[] partes = entrada.split(";");
        int id = Integer.parseInt(partes[0]);
        String nome = partes[1];
        Documento documento = new Documento(id, nome);
        documentos.insert(documento);
    }

    public void imprime(FIlaGenerica documentos) {

        if (documentos.isEmpty()) {
            System.err.println("Não há documentos para impressão");
        }
        
        while (!documentos.isEmpty()) {
            try {
                Object arquivo = documentos.remove();
                System.out.println("Imprimindo documento: " + arquivo);
                int tempo = (int) ((Math.random() * 1001) + 1000);
                Thread.sleep(tempo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
