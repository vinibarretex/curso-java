package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		// faz uma condição, o primeiro resultado após o ? é True e após : é false
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
