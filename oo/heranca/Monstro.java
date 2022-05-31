package oo.heranca;

public class Monstro extends Jogador {

	public Monstro() {
		// dessa maneira, tanto faz chamar o 'this' ou o 'super'
		this(0, 0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}
}
