package controller;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lista;

public class OrdemController {

	public OrdemController() {
		super();
	}

	public void ordem(Lista<Integer> lista) {
		System.out.println("Lista Original:");
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
                
                int vt[] = new int[tamanho];
                
                for (int i = 0; i < tamanho; i++) {
                    try {
                        vt[i] = (int) lista.get(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                
                while (!lista.isEmpty()) {
                    try {
                        lista.removeFirst();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
		
                MetodosOrdenacao ord = new MetodosOrdenacao();
                
                ord.bubbleSort(vt);
                
                for (int i = 0; i < tamanho; i++) {
                    try {
                        lista.add(vt[i], i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
		}
                
                System.out.println("Lista Ordenada:");
		for (int i = 0; i < tamanho; i++) {
                    try {
                        System.out.println(lista.get(i) + " ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
		}

	}

}
