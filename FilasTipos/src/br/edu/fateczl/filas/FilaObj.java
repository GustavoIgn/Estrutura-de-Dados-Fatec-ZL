package br.edu.fateczl.filas;

public class FilaObj {

	NoObj inicio;
	NoObj fim;

	public FilaObj() {
		inicio = null;
		fim = inicio;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;
	}

	public void insert(Object valor) {
		NoObj elemento = new NoObj();
		elemento.dado = valor;

		if (inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		} else {
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			} else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}

		}
	}

	public Object remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("FIla Vazia");
		}
		NoObj auxiliar = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}

		return auxiliar.dado;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}

		NoObj auxiliar = inicio;
		System.out.println("==============================");
		while (auxiliar != null) {
			System.out.print(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
		System.out.println("");
		System.out.println("==============================");
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoObj auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		NoObj auxiliar = inicio;
		while (auxiliar != null) {
			buffer.append("[");
			buffer.append(auxiliar.dado);
			buffer.append("]");
			buffer.append("[]->");
			
			auxiliar = auxiliar.proximo;
		}
		
		buffer.append("NULL");
		return buffer.toString();
		
	}
}
