package templateMethod.oo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Principal {

	public static void main(String[] args) throws IOException {
		Map<String,Object> mapa = new HashMap<>();
		mapa.put("nome","Carlos");
		mapa.put("idade",31);
		
		GeradorArquivo gerador = new GeradorPropriedadesCriptografado(10);
		gerador.gerarArquivo("c:\\Gerador\\Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorXMLCompactado();
		gerador1.gerarArquivo("c:\\Gerador\\XML.zip", mapa);

	}

}
