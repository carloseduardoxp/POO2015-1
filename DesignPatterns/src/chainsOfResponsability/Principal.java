package chainsOfResponsability;
import chainsOfResponsability.util.RecuperadorArquivo;
import chainsOfResponsability.util.RecuperadorBaseDados;
import chainsOfResponsability.util.RecuperadorCacheMemoria;
import chainsOfResponsability.util.RecuperadorServidorRemoto;



public class Principal {

	public static void main(String[] args) {
		RecuperadorArquivo recuperadorServidorRemoto = new RecuperadorServidorRemoto(null);
		RecuperadorArquivo recuperadorBaseDados = new RecuperadorBaseDados(recuperadorServidorRemoto);
		RecuperadorArquivo recuperadorMemoria = new RecuperadorCacheMemoria(recuperadorBaseDados);
		System.out.println(recuperadorMemoria.recuperar("teste"));
	}

}
