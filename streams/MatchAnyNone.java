package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchAnyNone {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Luna", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		// Depois dessas funções não é possível fazer outra
		
		// Todos os alunos foram aprovados?
		System.out.println(alunos.stream().allMatch(aprovado));
		
		// Tem algum aluno aprovado?
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		// Nenhum foi aprovado?
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
}
