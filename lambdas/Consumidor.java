package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		// Só aceita um único parametro e não retorna nada
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!");
			
		Produto p1 = new Produto("Caneta", 12.34, 0.20);
		imprimirNome.accept(p1);
		
		System.out.println(" ");
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 2.59, 0.01);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		System.out.println(" ");
		produtos.forEach(p -> System.out.println(p.preco));
		System.out.println(" ");
		produtos.forEach(System.out::println);
	}
}
