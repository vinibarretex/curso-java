package oo.composicao.desafio;

public class Desafio {

	public static void main(String[] args) {
				
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 4.69, 10);
		compra1.adicionarItem(new Produto("Notebook", 1899.90), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 7.99, 3);
		compra2.adicionarItem(new Produto("Tablet", 1499.90), 2);
		
		Cliente c1 = new Cliente("Ana");
		
		c1.compras.add(compra1);
		c1.adicionarCompra(compra2);
		
		System.out.println(c1.obterValorTotal());
	}
}
