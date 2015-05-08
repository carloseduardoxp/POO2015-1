package naoAnemico;


public class Conta {
	
	private Double limite;
	
	private Double saldo;
	
	public Conta(Double limite) {
		this.limite = limite;
	}
	
	public void deposita(Double valor) {
		this.saldo += valor;
	}
	
	public void saca(Double valor) throws Exception {
		if (this.saldo + this.limite >= valor) {
			this.saldo -= valor;
		} else {
			throw new Exception("saldo insuficiente");
		}
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	

}
