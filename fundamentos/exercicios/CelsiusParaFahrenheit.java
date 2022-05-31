package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor em Celsius: ");
		double celsius = entrada.nextDouble();
		
		final double FATOR = 9.0 / 5.0;
		final double AJUSTE = 32;
		
		double fahrenheit = (celsius * FATOR) + AJUSTE;
		
		System.out.printf("%.2f graus C = %.2f graus F", celsius, fahrenheit);
		
		entrada.close();
	}
}
