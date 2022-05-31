package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		int resultado1 =
				maisDois. // Valor inicial + 2
				andThen(vezesDois). // Função 'maisDois' * 2
				andThen(aoQuadrado). // Função 'vezesDois' ao quadrado
				apply(0); // Valor inicial
		
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}
}
