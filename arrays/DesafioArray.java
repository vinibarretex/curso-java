package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas voce deseja informar: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notasUsuario = new double[qtdeNotas];
		
		double totalNotas = 0;
		for (int i = 0; i < notasUsuario.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			totalNotas = entrada.nextDouble();
			notasUsuario[i] = totalNotas;
		}
		System.out.println(Arrays.toString(notasUsuario));
		
		double totalAluno = 0;
		for(double nota: notasUsuario) {
			totalAluno += nota;
		}
		
		System.out.printf("Media: %.2f", totalAluno / notasUsuario.length);

		entrada.close();
	}

}
