package hashtableErrado;

import java.util.Date;
import java.util.Properties;

public class PropertiesErrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//classe Properties, filha de Hashtable
		Properties p = new Properties();
		p.put("data",new Date());
		
		System.out.println("Peguei beleza "+p.get("data"));
		System.out.println("Peguei errado "+p.getProperty("data"));

	}

}
