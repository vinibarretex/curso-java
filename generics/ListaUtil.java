package generics;

import java.util.List;

public class ListaUtil {

	// Lista de qualquer tipo, fazendo o (cast) 
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1); // pegar o ultimo elemento da lista
		
	}
	
	// Utilizando o Generics
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1); 
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
	
}
