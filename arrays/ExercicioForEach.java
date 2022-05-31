package arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[5];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 4.9;
		notasAlunoA[4] = 8.5;
		
		for(double notas: notasAlunoA) {
			System.out.println(notas);
		}
	}
}
