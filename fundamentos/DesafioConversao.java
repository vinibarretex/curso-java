package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario: ");
		String s1 = teclado.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo salario: ");
		String s2 = teclado.nextLine().replace(",", ".");
		
		System.out.print("Informe o terceiro salario: ");
		String s3 = teclado.nextLine().replace(",", ".");
		
		double string1 = Double.parseDouble(s1);
		double string2 = Double.parseDouble(s2);
		double string3 = Double.parseDouble(s3);
		
		double soma = string1 + string2 + string3;
		System.out.println("A soma eh " + soma);
		System.out.println("A media eh " + soma / 3);
		
		teclado.close();
	}
}
