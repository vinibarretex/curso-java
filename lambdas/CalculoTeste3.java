package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Com essa interface (BinaryOperator) é necessário entrar com o ponto flutuante
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(3.0, 2.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(3.0, 2.0));
		
		// Com Integer		
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		System.out.println(calc2.apply(3, 2));
		
		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(3, 2));
	}
}
