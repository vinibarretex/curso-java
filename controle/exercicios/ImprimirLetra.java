package controle.exercicios;

import java.util.Scanner;

public class ImprimirLetra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

		entrada.close();
	}
}
