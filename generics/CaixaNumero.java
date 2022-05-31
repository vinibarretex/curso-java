package generics;

public class CaixaNumero<N extends Number> extends Caixa<N>{

	/*
	 * Nesse exemplo a classe tem o tipo N, mas N extends Number,
	 * então essa restrição precisa ser atendida pra funcionar
	 */
}
