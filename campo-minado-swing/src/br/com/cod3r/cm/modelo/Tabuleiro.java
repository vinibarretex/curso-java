package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

	private final int qtdeLinhas;
	private final int qtdeColunas;
	private final int qtdeMinas;

	private final List<Campo> campos = new ArrayList<Campo>();
	
	private final List<Consumer<ResultadoEvento>> observadores = 
			new ArrayList<>();

	public Tabuleiro(int qtdeLinhas, int qtdeColunas, int qtdeMinas) {
		this.qtdeLinhas = qtdeLinhas;
		this.qtdeColunas = qtdeColunas;
		this.qtdeMinas = qtdeMinas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registrarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream()
			.forEach(obs -> obs.accept(new ResultadoEvento(resultado)));
	}
	
	public void abrir(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha 
			&& c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.abrir());
	}
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha 
				&& c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < qtdeLinhas; linha++) {
			for (int coluna = 0; coluna < qtdeColunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}
	
	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream()
					.filter(minado).count();
		} while(minasArmadas < qtdeMinas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream()
				.allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public int getQtdeLinhas() {
		return qtdeLinhas;
	}

	public int getQtdeColunas() {
		return qtdeColunas;
	}

	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if(evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if(objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}
	
	private void mostrarMinas() {
		campos.stream()
			.filter(c -> c.isMinado())
			.filter(c -> !c.isMarcado())
			.forEach(c -> c.setAberto(true));
	}
	
}
