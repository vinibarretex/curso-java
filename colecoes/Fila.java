package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		// FIFO -> First In, First Out
		
		// Offer e Add -> adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia
		fila.add("Ana"); // retorna uma exceção (erro)
		fila.offer("Bia"); // retorna 'false' e não adiciona na fila
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		// A diferença entre eles é quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna um erro (No Such Element Exception)
		System.out.println(fila.element());
		
		// fila.size(); // retorna o tamanho da fila
		// fila.clear(); // limpa a fila
		// fila.isEmpty(); // retorna true/false (está vazia?)
		// fila.contains(); // verifica se contém determinado objeto
		
		// Poll e Remove -> obter o próximo elemento da fila e remove!
		// A diferença entre eles é quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // retorna um erro (No Such Element Exception)
		System.out.println(fila.poll()); 
		System.out.println(fila.remove());
		System.out.println(fila.poll()); 
		System.out.println(fila.remove());
		System.out.println(fila.poll()); // null
		System.out.println(fila.remove()); // erro
		
	}
}
