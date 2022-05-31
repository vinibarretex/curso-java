package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.5, false);
		Aluno a2 = new Aluno("Pedro", 8.0, true);
		Aluno a3 = new Aluno("Gui", 4.9, true);
		Aluno a4 = new Aluno("Vini", 6.5, false);
		Aluno a5 = new Aluno("Rebeca", 9.5, true);
		Aluno a6 = new Aluno("Gabi", 7.8, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		/*
		 * Usando lambda expression para selecionar apenas
		 * os aprovados
		 */
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Predicate<Aluno> bomComportamento = a -> a.bomComportamento;
		
		/*
		 * Usando a Function que recebe um aluno e devolve uma
		 * string para mostrar a mensagem de aprovação
		 */
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabens " + a.nome + "! Voce foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovado)
			.filter(bomComportamento)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
