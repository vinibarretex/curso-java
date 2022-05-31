package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("O IMC eh igual a %.2f", imc);
		
		entrada.close();
	}

}
