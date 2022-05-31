package classe;

public class DataTeste {

	public static void main(String[] args) {

		// Usando construtor com parametros
		// dia, mes, ano
		Data data = new Data(13, 04, 2022);

		System.out.println(data.obterDataFormatada());

		var data2 = new Data();
//		data2.dia = 18;
//		data2.mes = 06;
//		data2.ano = 2002;

		System.out.printf("\nVc nasceu dia %d/%d/%d", data2.dia, data2.mes, data2.ano);
	}
}
