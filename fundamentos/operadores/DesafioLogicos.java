package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		
		boolean trab_terca = false;
		boolean trab_quinta = true;
		
		boolean comprouTV50 = trab_quinta && trab_terca;
		boolean comprouTV32 = trab_quinta ^ trab_terca;
		boolean comprouSorvete = trab_quinta || trab_terca;
		boolean maisSaudavel = !comprouSorvete; // Operador Unário
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);

		System.out.println("Mais saudavel? " + maisSaudavel);
	}
}
