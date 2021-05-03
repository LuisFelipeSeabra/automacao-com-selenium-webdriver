package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;

public class ClientePage extends BasePage {

	public void escreverNome(String valor) {
		escreve("field-customerName", valor);
	}
	public void escreverUltimoNome( String valor) {
		escreve("field-contactLastName", valor);
	}
	public void escreverContatoPrimeiroNome( String valor) {
		escreve("field-contactFirstName", valor);
	}
	public void escreverTelefone(String valor) {
		escreve("field-phone", valor);
	}
	public void escreverPrimeiroEndereco(String valor) {
		escreve("field-addressLine1", valor);
	}
	public void escreverSegundoEndereco(String valor) {
		escreve("field-addressLine2", valor);
	}
	public void escreverCidade(String valor) {
		escreve("field-city", valor);
	}
	public void escreverestado( String valor) {
		escreve("field-state", valor);
	}
	public void escreverCodigoPostal( String valor) {
		escreve("field-postalCode", valor);
	}
	public void escreverPais(String valor) {
		escreve("field-country", valor);
	}
	public void escreverLimiteCredito(String valor) {
		escreve("field-creditLimit", valor);
	}
	public void selecionarEmpregador(String emp) throws InterruptedException {
		clicarBotao(By.xpath("//div[@id = 'field_salesRepEmployeeNumber_chosen']//a//span"));
		Thread.sleep(2000);
		enviarTexto(emp);
	}
	public void clicarSalvar()  {
		ClicarBotaoScript(By.xpath("//div[@class='form-group gcrud-form-group']//button[@id = 'form-button-save']"));	
	}
	public String obterMensagemDeSucesso() {
		return obterTexto(By.xpath("//div[@id='report-success']//p"));
	}
	public void clicarSalvarEVoltar()  {
		ClicarBotaoScript(By.xpath("//div[@class='form-group gcrud-form-group']//button[@id = 'save-and-go-back-button']"));	
	}
	public void clicarEmVoltarParaLista() {
		ClicarBotaoScript(By.xpath("//div[@class='form-group gcrud-form-group']//a[2]"));
	}
}
