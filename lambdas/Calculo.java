package lambdas;

@FunctionalInterface
// uma interface funcional só pode receber 1 método

public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
