package br.edu.fateczl.filagenerica;

public class FIlaGenerica<T> {

	NoGenerico<T> inicio;
	NoGenerico<T> fim;

	public FIlaGenerica() {
		inicio = null;
		fim = inicio;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;
	}

	public void insert(T valor) {
		NoGenerico<T> elemento = new NoGenerico<T>();
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

	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("FIla Vazia");
		}
		NoGenerico<T> auxiliar = inicio;
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

		NoGenerico<T> auxiliar = inicio;
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
			NoGenerico<T> auxiliar = inicio;
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
		NoGenerico<T> auxiliar = inicio;
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
