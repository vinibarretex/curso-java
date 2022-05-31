package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		/*
		 * Quando a caixaA foi instanciada, eu defini qual seria
		 * o tipo dela, onde na classe Caixa, eu deixei como um 
		 * valor genérico
		 */
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo");
		
		System.out.println(caixaA.abrir());
		
		
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415);
		
		System.out.println(caixaB.abrir());
	}
}
