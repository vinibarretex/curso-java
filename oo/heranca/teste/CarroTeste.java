package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Jetta;

public class CarroTeste {

	public static void main(String[] args) {
		
		Jetta jetta = new Jetta();
		
		jetta.velocidadeAtual = 0;
		
		jetta.acelerar();
		jetta.acelerar();
		jetta.acelerar();
		jetta.acelerar();
		System.out.println("Velocidade do Jetta: " 
				+ jetta.velocidadeAtual + "km/h");
		
		jetta.frear();
		jetta.frear();
		jetta.frear();
		jetta.frear();
		jetta.frear();
		jetta.frear();
		System.out.println("Velocidade do Jetta: " 
				+ jetta.velocidadeAtual + "km/h");
		
		Ferrari f1 = new Ferrari(400);
		f1.ligarTurbo();
		
		System.out.println(f1.velocidadeDoAr());
		
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		System.out.println("Velocidade da Ferrari: " 
				+ f1.velocidadeAtual + "km/h");
	}
}
