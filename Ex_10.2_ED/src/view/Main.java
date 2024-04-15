package view;

import model.Processo;
import br.edu.fateczl.filagenerica.FIlaGenerica;
import controller.EscalonadorController;

public class Main {
    
	public static void main(String[] args) {
		
		FIlaGenerica filaProcesso = new FIlaGenerica();
                
		String[] processos = {"notepad.exe","write.exe","chrome.exe","acrobat.exe","firefox.exe","word.exe"};
                
		int tamanho = processos.length;
		for(int i = 0; i < tamanho; i++){
			String nomeProcesso = processos[i];
			int quantidade = (int)(Math.random() * 50);
			Processo processo = new Processo(nomeProcesso, quantidade);
			filaProcesso.insert(processo);
		}
		
		EscalonadorController escalonador = new EscalonadorController();
		filaProcesso = escalonador.escalonador(filaProcesso);
		while(!filaProcesso.isEmpty()) {
			try {
				Object x = filaProcesso.remove();
				System.out.println(x);
			} catch (Exception e) {
				System.err.println();
			}
		}
	}

}