package mutavel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataMutavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar data = new GregorianCalendar(2012,4,10);
		Cliente cliente1 = new Cliente();
		cliente1.setVencimento(data);
		
		Calendar diasDepois = cliente1.getVencimento();
		diasDepois.add(Calendar.DAY_OF_MONTH,2);
		Cliente cliente2 = new Cliente();
		cliente2.setVencimento(diasDepois);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("vencimento do cliente 1 -> "+sdf.format(cliente1.getVencimento().getTime()));
		System.out.println("vencimento do cliente 2 -> "+sdf.format(cliente2.getVencimento().getTime()));

	}

}
