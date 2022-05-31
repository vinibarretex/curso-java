package classe;

public class AreaCirc {

	double raio;
	// static significa que o valor
	final static double PI = 3.14;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
