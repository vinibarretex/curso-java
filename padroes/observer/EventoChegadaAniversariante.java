package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {

	// momento que aconteceu o evento
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
