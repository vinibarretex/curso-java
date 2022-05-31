package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Implementação com lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(3, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(3, 2));
		
		System.out.println(calc.legal());
	}
}
