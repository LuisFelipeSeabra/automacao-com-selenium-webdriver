package br.df.lseabra.core;

import br.df.lseabra.page.ClientePage;
import br.df.lseabra.page.IndexPage;

public class Steps {
	ClientePage page = new ClientePage();
	IndexPage pageIndex = new IndexPage();

	public void cadastrarUsuario(String nome, String ultNome, String contato, String telefone, String pEndereco,
			String sEndereco, String cidade, String estado, String codPostal, String pais, String limiteCredito,
			String emp) throws InterruptedException {
		
		pageIndex.selecionarVersao();
		pageIndex.clicarAddCustomer();
		page.escreverNome(nome);
		page.escreverUltimoNome(ultNome);
		page.escreverContatoPrimeiroNome(contato);
		page.escreverTelefone(telefone);
		page.escreverPrimeiroEndereco(pEndereco);
		page.escreverSegundoEndereco(sEndereco);
		page.escreverCidade(cidade);
		page.escreverestado(estado);
		page.escreverCodigoPostal(codPostal);
		page.escreverPais(pais);
		page.escreverLimiteCredito(limiteCredito);
		page.selecionarEmpregador(emp);
		page.clicarSalvar();
	}

	public String obterMensagemSucesso() {
		return page.obterMensagemDeSucesso();
	}

	public void voltarParaLista() {
		espera();
		page.clicarEmVoltarParaLista();
	}

	public void escreverNome(String nome) {
		pageIndex.escreverNome(nome);
	}
	
	public void marcarTudo() {
		espera();
		pageIndex.clicarCheckbox();
	}
	
	public void clicarEmDelete() {
		pageIndex.clicarEmDelete();
	}
	
	public String obterMensagemPopUp() {
		espera();
		return pageIndex.obterMensagemPopUp();
	}
	
	public void clicarEmDeletePopUp() {
		espera();
		pageIndex.confirmarDelete();
	}	
	
	public String obterMensagemDeSucessoDeletePopUp() {
		espera();
		return pageIndex.obterMensagemDeSucessoDeletePopUp();
	}
	
	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
