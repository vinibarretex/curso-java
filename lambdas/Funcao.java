package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		// Só aceita um único parametro e produz um resultado
		// A saída de um método é a entrada de outro
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
						
		Function<String, String> oResultadoE = 
				valor -> "O resultado eh: " + valor;
				
		Function <String, String> empolgado = 
				valor -> valor + "!!!";
					
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(2);
		
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(3));
	}
}
