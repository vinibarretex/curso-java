package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Caio";
		
		compra1.adicionarItem("Caneta", 5, 4.35);
		compra1.adicionarItem(new Item("Borracha", 3, 2.99));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		double total = compra1.itens.get(0).compra
				.itens.get(1).compra.obterValorTotal();
		
		System.out.println("O total eh R$" + total);
	}
}
