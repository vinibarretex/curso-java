package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Hello World".charAt(3));
		
		String s = "Boa tarde";
		
		// Duas formas de concatenar strings
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		System.out.println(s.length());
		
		// Para comparar strings
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boA Tarde"));
		
		// Pular linha
		System.out.println("\n");
		
		
		var nome = "Vinicius";
		var sobrenome = "Ribeiro";
		var idade = 20;
		var salario = 2950.58;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
		+ sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.println("\n");
		
		// %s = strings | %d = inteiros | %f = flutuantes
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
