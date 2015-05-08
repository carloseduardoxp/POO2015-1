package templateMethod.estruturado;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;


public class GeradorArquivo {
		
	public final void gerarArquivo(String nome,Map<String,Object> propriedades,
			Formato formato) throws IOException {
		byte[] bytes;
		if (formato == Formato.PROPRIEDADES_CRIPTOGRAFADO) {
			bytes = gerarPropriedadesCriptografado(nome,propriedades);
		} else {
			bytes = gerarXmlCompactado(nome,propriedades);
		}
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	private byte[] gerarXmlCompactado(String nome,
			Map<String, Object> propriedades) throws IOException {
		GeradorXMLCompactado gerador = new GeradorXMLCompactado();
		String conteudo = gerador.gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		return gerador.processar(bytes);		
	}

	private byte[] gerarPropriedadesCriptografado(String nome,
			Map<String, Object> propriedades) throws IOException {
		GeradorPropriedadesCriptografado gerador = new GeradorPropriedadesCriptografado(10);
		String conteudo = gerador.gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		return gerador.processar(bytes);		
	}

}
