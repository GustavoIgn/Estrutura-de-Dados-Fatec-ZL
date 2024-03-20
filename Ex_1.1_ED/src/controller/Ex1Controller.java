package controller;

public class Ex1Controller {
	
	public Ex1Controller() {
		super();
	}
	
	//Condição de Parada: O número ser menor que 0, pois foge do dominio dos naturais.
	public int SomaNaturais (int n) {
		if (n < 0) {
			return 0;
		} else {
			return n + SomaNaturais(n -1);
			/* 
				A função subtrai 1 do número digitado (n), e então ao chegar 
				em um número menor que 0, retorna somando o valor guardado até chegar
				no número digitado... Ex: N = 5, Resultado = 5+4+3+2+1 = 15
			*/
		}
	}
}
