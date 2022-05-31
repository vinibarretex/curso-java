package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	// Construtor Padrão
	Produto() {
		
	}
	
	// Contrutor com todos os parametros
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	// Nomes iguais com parametros diferentes
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
