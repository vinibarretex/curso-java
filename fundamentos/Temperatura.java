package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		int fahrenheit = 77;
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		// (°F - 32) * 5/9 = °C
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius);
	}
}
