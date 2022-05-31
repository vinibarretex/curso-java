package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 43, 2, 58, 10, 76, 81);
		System.out.println("\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digito o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.printf("%s %s tem %d anos, com %.2fcm e %.2fkg", 
				nome, sobrenome, idade, altura, peso);
		
		entrada.close();
	}
}
