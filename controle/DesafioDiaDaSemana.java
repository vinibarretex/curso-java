package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia: ");
		String dia_semana = entrada.next();
		
		if(dia_semana.equalsIgnoreCase("Domingo")) {
			System.out.println(dia_semana + " = 1");
		} else if(dia_semana.equalsIgnoreCase("Segunda")) {
			System.out.println(dia_semana + " = 2");
		} else if(dia_semana.equalsIgnoreCase("Terça")) {
			System.out.println(dia_semana + " = 3");
		} else if(dia_semana.equalsIgnoreCase("Quarta")) {
			System.out.println(dia_semana + " = 4");
		} else if(dia_semana.equalsIgnoreCase("Quinta")) {
			System.out.println(dia_semana + " = 5");
		} else if(dia_semana.equalsIgnoreCase("Sexta")) {
			System.out.println(dia_semana + " = 6");
		} else if(dia_semana.equalsIgnoreCase("Sabado")) {
			System.out.println(dia_semana + " = 7");
		} else {
			System.out.println("Dia invalido");
		}
		
		entrada.close();
	}
}
