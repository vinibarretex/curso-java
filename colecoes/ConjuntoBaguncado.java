package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(2.6);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho eh " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanho eh " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(true));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho eh " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // União entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // Retem aquilo que está no outro conjunto
		System.out.println(conjunto);
	}
}
