package controle.exercicios;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int somaPositivos = 0;
		
		while(numero >= 0) {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			if(numero >= 0) {			
				somaPositivos += numero;
				System.out.println("Soma até agora: " + somaPositivos);
			}
			
		}

		entrada.close();
	}
}
