package generics;

import java.util.LinkedHashSet; // Organiza pela ordem de inclusão
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; // Se a chave for nula, o return sai do método 
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		// Sem esse código, ele ignora se o valor já existe
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = 
				itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent() ? 
				parOpcional.get().getValor() : null;
	}
}