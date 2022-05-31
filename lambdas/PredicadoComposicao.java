package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999;
				
		// As duas sentanças tem que ser verdadeiras
		System.out.println(isPar.and(isTresDigitos).test(122));
		
		// Uma das duas sentenças tem que ser verdadeiras
		System.out.println(isPar.or(isTresDigitos).test(2));
	}
}
