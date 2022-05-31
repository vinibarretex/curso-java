package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		
		System.out.println(s);
		
		System.out.println("Vini".toUpperCase());
		
		String y = "Bom dia Y"
				.replace("Y", "Vini")
				.toLowerCase().concat("!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		// a.
		System.out.println(a);
	}
}
