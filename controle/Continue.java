package controle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			if(i % 2 == 1) {
				// uma forma de imprimir apenas os pares, pois 
				// quando ele encontra um impar, ele ignora 
				// essa linha de código
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}
}
