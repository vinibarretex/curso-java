package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Pedro");
		Aluno aluno2 = new Aluno("Gustavo");
		Aluno aluno3 = new Aluno("Ana");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Kotlin Avançado");
		Curso curso3 = new Curso("Python 2022");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso de " 
					+ curso3.nome + "...");
			System.out.println("... e meu nome eh " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoProcurado("Kotlin Avançado");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
