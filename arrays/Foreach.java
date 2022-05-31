package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		// Cria uma nova variável que contém os indices do array
		for(double nota: notas) {
			System.out.print(nota + " - ");
		}
	}
}
