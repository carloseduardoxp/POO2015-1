package stream;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class ImportadoraDados {
	
	public static void main(String args[]) throws Exception {
		FileInputStream fin = new FileInputStream("teste.txt");
		new ImportadoraDados().carrega(fin);
		
		byte[] b = new byte[]{'a','b','c'};
		//nao funciona
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		//carrega(bais)
		
	}
	
	public void carrega(FileInputStream stream) {
	    
	}

}
