package anemico;

public class Banco {
	
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
	}
	
	public void saca(Conta conta, double valor) throws Exception {
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
		} else {
			throw new Exception("saldo insuficiente");
		}
	}

}
