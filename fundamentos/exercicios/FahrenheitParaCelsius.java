package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("%.2f graus F = %.2f graus C", fahrenheit, celsius);
		
		entrada.close();
	}
}
