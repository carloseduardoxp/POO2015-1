package model.domain;

public class Fornecedor extends Pessoa {
	
	private String cnpj;

	public Fornecedor(Integer codigo, String nome, String endereco,
			String telefone, String email, String cnpj) {
		super(codigo, nome, endereco, telefone, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", getCodigo()=" + getCodigo()
				+ ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getTelefone()=" + getTelefone()
				+ ", getEmail()=" + getEmail() + "]";
	}
	
	
	
	

}
