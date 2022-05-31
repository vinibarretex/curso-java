package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		// Maneira de instanciar um objeto usando o construtor 
		// com parametros
		Produto p1 = new Produto("Notebook", 4356.89);
		
		// Maneira de instanciar um objeto usando o construtor 
		// padrão
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		// Altera o desconto de todos os produtos
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + ": " + p1.precoComDesconto());
		System.out.println(p2.nome + ": " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
	}
}
