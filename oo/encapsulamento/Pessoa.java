package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		// idade negativa passa a ser positiva
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}

	@Override
	public String toString() {
		return "Oi, eu sou o " + getNome()
			+ " e tenho " + getIdade() + " anos"; 
	}
	
}
