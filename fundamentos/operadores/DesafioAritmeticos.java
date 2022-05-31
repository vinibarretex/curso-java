package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int numA = (int) Math.pow(6 * (3 + 2), 2);
		int denA = 3 * 2;
		
		int numB = (1 - 5) * (2 - 7);
		int denB = 2;
		
		int superiorA = numA / denA;
		int superiorB = (int) Math.pow(numB / denB, 2);
		
		int superior = (int) Math.pow(superiorA - superiorB, 3);
		int inferior = (int) Math.pow(10, 3);
		
		int resultado = superior / inferior;
		
		System.out.println("O resultado eh " + resultado);
	}
}
