package generics;

// Classe genérica
public class Caixa<T> {

	/*
	 * O tipo dessa classe só será definido no momento
	 * da construção
	 */
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
