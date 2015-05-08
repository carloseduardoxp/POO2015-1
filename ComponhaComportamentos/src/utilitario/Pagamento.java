package utilitario;

public class Pagamento {
	
	private Double valor;
	
	private TipoServico  tipoServico;
	
	private Boolean recebeConfirmacao;
	
	private String item;
	
	public String getItem() {
		return item;
	}

	public Boolean desejaReceberConfirmacao() {
		return recebeConfirmacao;
	}

	public Double getValor() {
		return valor;
	}
	
	public Boolean isServico() {
		return tipoServico == TipoServico.SERVICO;
	}
	
	public Boolean isProduto() {
		return tipoServico == TipoServico.PRODUTO;
	}
	
	

}
