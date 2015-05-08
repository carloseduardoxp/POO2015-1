package imutavel;

import java.util.Calendar;

public class Cliente {
	
	private Calendar vencimento;

	public Calendar getVencimento() {
		Calendar c = Calendar.getInstance();
		c.setTime(vencimento.getTime());
		return c;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

}
