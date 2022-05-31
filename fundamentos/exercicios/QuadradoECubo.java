package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = entrada.nextInt();
		
		int quadrado = valor * valor;
		int cubo = (int) Math.pow(valor, 3);
		
		System.out.println("Valor: " + valor);
		System.out.println("Quadrado: " + quadrado);
		System.out.println("Cubo: " + cubo);
		
		entrada.close();
	}
}
