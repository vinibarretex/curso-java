package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		// Conversão implícita
		double a = 1;
		System.out.println(a);

		// Conversão explícita (CAST)
		// Pode perder informação
		float b = (float) 1.1234;
		System.out.println(b);

		int c = 4;
		// byte d = c;
		byte d = (byte) c; // Conversão explícita (CAST)
		System.out.println(d);
		
		/*
		 * CAST nada mais é, do que especificar qual será o tipo
		 * da variável explicitamente, exemplo: 
		 */
		
		double e = 1; // saída será = 1.0
		int f = (int) e;
		//int f = e; //Type mismatch: cannot convert from double to int
		System.out.println(f);
	}
}
