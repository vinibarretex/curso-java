package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		/*
		 * HashSet não garante a ordem de inserção
		 */
		Set<Integer> lista = new HashSet<>();
		lista.add(1);
		lista.add(4);
		lista.add(120);
		lista.add(50);
		
		for(int n: lista) {
			System.out.println(n);
		}
		
		/*
		 * TreeSet garante a ordem de inserção
		 */
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Vinicius");
		listaAprovados.add("Yan");
		listaAprovados.add("Thomas");
		listaAprovados.add("Julia");
		listaAprovados.add("Vitoria");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
	}
}
