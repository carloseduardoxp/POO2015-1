package factoryMethod;

import java.io.IOException;

import factoryMethod.domain.Produto;
import factoryMethod.service.ServicoAbstrato;
import factoryMethod.service.ServicoProduto;
import factoryMethod.util.GeradorPropriedadesCriptografado;


public class Principal {
	
	public static void main(String[] args) throws IOException {
		ServicoAbstrato<Produto> servico = new ServicoProduto(new GeradorPropriedadesCriptografado(10));
		servico.gravarEntidadeEmArquivo(1,"c:\\Gerador\\teste");		
	}

}

