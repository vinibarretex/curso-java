package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Apple Macbook Air", 7999.90);
		Produto p2 = new Produto("Apple iPad", 3699.90);
		Produto p3 = new Produto("Apple iPhone 13 mini", 4699.98);
		Produto p4 = new Produto("Apple Air Pods", 1499.49);
		Produto p5 = new Produto("Fogão", 299.90);
		Produto p6 = new Produto("Microondas", 499.90);
		Produto p7 = new Produto("Geladeira", 999.90);
		Produto p8 = new Produto("SmarTV 50\"", 1499.90);
		Produto p9 = new Produto("PlayStation 5", 4199.90);
		Produto p10 = new Produto("Guarda roupa", 699.90);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		Predicate<Produto> caro = p -> p.preco >= 1500;
		
		Predicate<Produto> caractere = p -> p.nome.startsWith("Apple");
		
		Function<Produto, String> msgCaro = 
				p -> "O produto " + p.nome + " esta acima de R$500. "
						+ "Com um valor de R$" + p.preco;
		
		produtos.stream()
			.filter(caro)
			.filter(caractere)
			.map(msgCaro)
			.forEach(System.out::println);
		
	}
}
