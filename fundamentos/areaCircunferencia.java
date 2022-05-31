package fundamentos;

public class areaCircunferencia {
	public static void main(String[] args) {
		// = significa Atribuição
		double raio = 3.4;
		
		//não pode ser alterada, foi transformada em constante
		//uma convenção é criar constantes com letras maiusculas
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("Area = " + area);
	}
}
