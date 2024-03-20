<<<<<<< HEAD
package controller;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;

public class Controller {

	public Controller() {
		super();
	}

	public void ordenaVetorBubble(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();

		double tempoInicial = System.nanoTime();
		ord.bubbleSort(vt);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

	public void ordenaVetorMerge(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		
		double tempoInicial = System.nanoTime();
		ord.mergeSort(vt, 0, vt.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

	public void ordenaVetorQuick(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		
		double tempoInicial = System.nanoTime();
		ord.quickSort(vt, 0, vt.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

}
=======
package controller;

import br.edu.fateczl.ordenacao.MetodosOrdenacao;

public class Controller {

	public Controller() {
		super();
	}

	public void ordenaVetorBubble(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();

		double tempoInicial = System.nanoTime();
		ord.bubbleSort(vt);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

	public void ordenaVetorMerge(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		
		double tempoInicial = System.nanoTime();
		ord.mergeSort(vt, 0, vt.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

	public void ordenaVetorQuick(int[] vt) {
		MetodosOrdenacao ord = new MetodosOrdenacao();
		
		double tempoInicial = System.nanoTime();
		ord.quickSort(vt, 0, vt.length - 1);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		System.out.println("Vetor Ordenado ==> " + tempoTotalEmS + " S.");
	}

}
>>>>>>> bd1900993ee0abac65dd55f79e04e36af486857e
