package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Vinicius");
		lista.add(u1);
		
		lista.add(new Usuario("Vitoria"));
		lista.add(new Usuario("Thomas"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Julia"));
		
		System.out.println(lista.get(4)); // acessar pelo indice
		
		System.out.println(">>>> " + lista.remove(1));
		System.out.println("Removeu? " + lista.remove(new Usuario("Bia")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Vitoria")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
