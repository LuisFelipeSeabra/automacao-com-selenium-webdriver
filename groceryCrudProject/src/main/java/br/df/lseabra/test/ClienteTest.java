package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.Test;
import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;
import br.df.lseabra.page.IndexPage;

public class ClienteTest extends BaseTest {
	
	Steps step = new Steps();
	IndexPage pageIndex = new IndexPage();

	@Test
	public void cadastrarCliente() throws InterruptedException {
		step.cadastrarUsuario("Teste Sicredi","Teste","Luis Felipe Seabra","51 9999-9999","Av Assis Brasil, 3970","Torre D","Porto Alegre"," RS","91000-000","Brasil","200","Fixter");
		Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list",step.obterMensagemSucesso());
	}
}
