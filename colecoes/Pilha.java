package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		// LIFO -> Last In, First Out
		
		livros.add("Percy Jackson");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		// será removido o último elemento adicionado (O Hobbit)
		System.out.println(livros.peek()); 
		System.out.println(livros.element());
		
		for (String livro: livros) {
			System.out.println(">>> " + livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.pop()); 
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		
		// fila.size(); // retorna o tamanho da fila
		// fila.clear(); // limpa a fila
		// fila.isEmpty(); // retorna true/false (está vazia?)
		// fila.contains(); // verifica se contém determinado objeto
		
		
	}
}
