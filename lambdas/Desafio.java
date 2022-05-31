package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
				
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: Produto >= 3000 ($100 de frete)/ < 3000 ($50)
		 * 4. Arredondar: Deixar com duas casas decimais
		 * 5. Formatar: R$1234,56 (Duas casas decimais e trocar '.' por ','
		 */
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("iPhone 13 mini", 4699.98, 0.15);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final eh: " + preco);
				
	}
}
