package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// Construtor padrão 01/01/1970
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
		// this(1, 1, 1970);
	}
	
	// Construtor com os parametros
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
