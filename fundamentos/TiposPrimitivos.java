package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionário 
		
		// Tipos numéricos inteiros 
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56759;
		long pontosAcumulados = 2_234_843_223L; //Literal Long
		
		// Tipos numéricos reais
		float salario = 11_445.50f; //Literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano 
		boolean estaDeFerias = false; //true 
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Número de voos 
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("id " + id + ": ganha -> " + salario);
		System.out.println("Ferias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
