package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("Este ano é bissexto");
		} else {
			System.out.println("Este ano não é bissexto");
		}

		entrada.close();
	}
}
