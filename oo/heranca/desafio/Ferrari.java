package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	// As duas váriaveis foram inicializadas como false implicitamente
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		setDelta(35);
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		setDelta(15);
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		// Turbo ligado e Ar desligado
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) { // Os dois ligados
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
	
//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
}
