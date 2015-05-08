package templateMethod.estruturado;
import java.io.IOException;
import java.util.Map;


public class GeradorPropriedadesCriptografado {
	
	private Integer delay;
	
	public GeradorPropriedadesCriptografado(Integer delay) {
		super();
		this.delay = delay;
	}

	protected byte[] processar(byte[] bytes) throws IOException {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0;i<bytes.length;i++) {
			newBytes[i] = (byte)((bytes[i]+delay) % Byte.MAX_VALUE);
		}		
		return newBytes;
	}

	protected String gerarConteudo(Map<String, Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();		
		for (String prop: propriedades.keySet()) {
			propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
		}		
		return propFileBuilder.toString();
	}
}