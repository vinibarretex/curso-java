package controle.exercicios;

import java.util.Scanner;

public class ParEntre0e10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o numero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("O numero " + numero + " é PAR ");
			} else {
				System.out.println("O numero " + numero + " é ÍMPAR ");
			}
		} else {
			System.out.println("Numero invalido");
		}

		entrada.close();
	}
}
