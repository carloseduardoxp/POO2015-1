package model.domain;

public class Cliente extends Pessoa {
	
	private Double desconto;
	
	private String cpf;

	public Cliente(Integer codigo, String nome, String endereco,
			String telefone, String email, Double desconto, String cpf) {
		super(codigo, nome, endereco, telefone, email);
		this.desconto = desconto;
		this.cpf = cpf;
	}
	
	public Double obterValorComDesconto(Double valorPedido) {
		return valorPedido - (valorPedido * desconto / 100);
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [desconto=" + desconto + ", cpf=" + cpf
				+ ", getCodigo()=" + getCodigo() + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + ", getEmail()=" + getEmail() + "]";
	}

	
	
	

}
