package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;
import br.df.lseabra.core.DriverFactory;

public class IndexPage extends BasePage {

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.grocerycrud.com/demo/bootstrap_theme");	
	}
	public void clicarVersao() {
		clicarBotao(By.id("switch-version-select"));
	}
	public void selecionarVersao() {
		clicarBotao(By.xpath("//select[@id = 'switch-version-select']/option[@value = '/demo/bootstrap_theme_v4']"));
	}
	public void clicarAddCustomer() throws InterruptedException {
		ClicarBotaoScript(By.xpath("//div[@class = 'header-tools']//a[@class = 'btn btn-default btn-outline-dark']"));
		Thread.sleep(2000);
	}
	public void escreverNome(String nome) {
		escreve(By.xpath("//input[@name='customerName']"), nome);
	}
	public void clicarCheckbox() {
		clicarBotao(By.xpath("//table[@class='table table-bordered grocery-crud-table table-hover']//tr[@class='filter-row gc-search-row']//input[@type='checkbox' ]"));
	}
	public void clicarEmDelete() {
		clicarBotao(By.linkText("Delete"));
	}
	public String obterMensagemPopUp() {
		return obterTextoPopUp();
	}
	public void clicarEmDeletePopUp() {
		clicarBotao(By.xpath("//button[@class ='btn btn-danger delete-multiple-confirmation-button']"));
	}
	public String obterMensagemDeSucessoDeletePopUp() {
		//return obterTexto(By.className("btn btn-danger delete-multiple-confirmation-button"));
		return obterTexto(By.xpath("//div[@data-growl='container']//span/p"));
	}
	public void confirmarDelete() {
		clicarEmDeletePopUp2(By.cssSelector("button[class='btn btn-danger delete-multiple-confirmation-button']"));
		
	}

}
