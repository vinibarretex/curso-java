package modelo.composicao;

import javax.persistence.Embeddable;

/* Faz com que essa entidade seja inserida dentro da tabela de 
 * fornecedores e funcionarios
 */
@Embeddable
public class Endereco {

	private String logradouro;
	private String complemento;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
