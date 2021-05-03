package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.Test;

import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class IndexTest extends BaseTest {

	Steps step = new Steps();
	
	@Test
	public void deletarCliente() throws InterruptedException {
		step.cadastrarUsuario("Teste Sicredi","Teste","Luis Felipe Seabra","51 9999-9999","Av Assis Brasil, 3970","Torre D","Porto Alegre"," RS","91000-000","Brasil","200","Fixter");
		step.voltarParaLista();
		step.escreverNome("Teste Sicredi");
		step.marcarTudo();
		step.clicarEmDelete();
		System.out.println(step.obterMensagemPopUp());
		Assert.assertEquals("Are you sure that you want to delete this 1 item?", step.obterMensagemPopUp());
		step.clicarEmDeletePopUp();
		Assert.assertEquals("Your data has been successfully deleted from the database.", step.obterMensagemDeSucessoDeletePopUp());
		
	}
	
	
}
