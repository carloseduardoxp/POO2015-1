package anemico;

public class Conta {
	
	private Double limite;
	
	private Double saldo;
	
	public Conta() {
		saldo = 0d;
		limite = 0d;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public Double getSaldo() {
		return saldo;
	}

	//um saldo de uma conta pode ser assim substituído por outro qualquer?
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
