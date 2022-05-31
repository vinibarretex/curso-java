package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Gabriel"));		
		usuarios.add(new Usuario("Bruno"));
		
		boolean resultado = usuarios.contains(new Usuario("Bruno"));
		System.out.println(resultado);
		
	}
}
