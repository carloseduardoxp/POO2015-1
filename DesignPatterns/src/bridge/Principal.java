package bridge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bridge.util.Compactador;
import bridge.util.Criptografador;
import bridge.util.GeradorArquivo;
import bridge.util.GeradorPropriedades;
import bridge.util.GeradorXML;


public class Principal {

	public static void main(String[] args) throws IOException {
		Map<String,Object> mapa = new HashMap<>();
		mapa.put("nome","Carlos");
		mapa.put("idade",31);
		
		GeradorArquivo gerador = new GeradorPropriedades();
		gerador.setProcessador(new Criptografador(10));
		gerador.gerarArquivo("c:\\Softwares\\Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorXML();
		gerador1.setProcessador(new Compactador());
		gerador1.gerarArquivo("c:\\Softwares\\XML.txt", mapa);

	}

}
