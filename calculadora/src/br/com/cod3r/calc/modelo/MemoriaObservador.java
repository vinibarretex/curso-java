package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	// Todos os métodos de uma interface, por padrão são publicos
	void valorAlterado(String novoValor);
}
