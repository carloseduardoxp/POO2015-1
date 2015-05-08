package anemico;

public class Main {
	
	public static void main(String args[]) {
		Banco banco = new Banco();
		Conta conta = new Conta();
		try {
			//quero 5 conto para turbinar meu PC
			banco.saca(conta,5000);
		} catch (Exception e) {
			//nao tem problema lero leroooo
			conta.setSaldo(1000000000000d);
			try {
				banco.saca(conta, 5000);	
			} catch (Exception e2) {
				System.out.println("Agora ja era "+e2);
			}
			
		}
	}

}
