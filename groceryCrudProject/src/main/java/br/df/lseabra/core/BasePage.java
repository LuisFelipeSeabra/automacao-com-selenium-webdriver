package br.df.lseabra.core;

import static br.df.lseabra.core.DriverFactory.getDriver;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public void escreve(String id_campo, String texto ) {
		try {
			Thread.sleep(500);
			espera(By.id(id_campo));
			getDriver().findElement(By.id(id_campo)).clear();
			getDriver().findElement(By.id(id_campo)).sendKeys(texto);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public void escreve(By by, String texto ) {
		try {
			Thread.sleep(500);
			espera(by);
			getDriver().findElement(by).clear();
			getDriver().findElement(by).sendKeys(texto);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void clicarBotao(By by) {
		espera(by);
		getDriver().findElement(by).click();
	}
	public Boolean isCheckMarcado(By by) throws InterruptedException {
		Thread.sleep(2000);
		if(getDriver().findElements(by).size()>0) {
			return true;	
		}
		else {
			return false;
		}
		
	}	
	public String obterTexto(By by) {
		espera(by);
		return getDriver().findElement(by).getText();
	}
	
	public String obterAtributo(By by) {
		espera(by);
		return getDriver().findElement(by).getAttribute("value");
	}
	
	public String obterTextoScript(By by) {	
		espera(by);
		if (getDriver() instanceof JavascriptExecutor) {
		   return (String)((JavascriptExecutor)getDriver()).executeScript("return arguments[0].childNodes[0].nodeValue;",getDriver().findElement(by));
			
		} else {
		    return "Erro JavaScript!";
		}
		
	}
	
	public void ClicarBotaoScript(By by) {	
		espera(by);
		if (getDriver() instanceof JavascriptExecutor) {
		   ((JavascriptExecutor)getDriver()).executeScript("return arguments[0].click();",getDriver().findElement(by));

		} else {
		    System.out.println("Erro JavaScript!");
		}
	}
	public void ClicarBotaoScript5(By by) {	
		
		if (getDriver() instanceof JavascriptExecutor) {
		   ((JavascriptExecutor)getDriver()).executeScript("return arguments[0].click();",getDriver().findElement(by));

		} else {
		    System.out.println("Erro JavaScript!");
		}
	}
	
	public void ClicarBotaoScript2(By by) throws InterruptedException {	
		espera(by);
		if (getDriver() instanceof JavascriptExecutor) {
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(by));
		   ((JavascriptExecutor)getDriver()).executeScript("return arguments[0].click();",getDriver().findElement(by));

		} else {
		    System.out.println("Erro JavaScript!");
		}
	}
	
	public void ClicarBotaoScript3(By by) {	
		espera(by);
		getDriver().findElement(by).click();
	}
	
	public static String fetchLocatorValue(String key) {
		Properties property = new Properties();
		return property.get(key).toString();
	}
	
	public void selecionarCombo(String id_campo, String valor) {
		WebElement element = getDriver().findElement(By.id(id_campo));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	public void selecionarCombo2(String id_campo, String valor) {
		WebElement element = getDriver().findElement(By.id(id_campo));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	public void selecionarCombo3(String txt) {
		    
        JavascriptExecutor executor= (JavascriptExecutor)getDriver();
        executor.executeScript("document.getElementXpath('//div[@class='form-group salesRepEmployeeNumber_form_group row']//div[@class='col-sm-9']//select[@id = 'field-salesRepEmployeeNumber']').style.display='block';");
        Select select1 = new Select(getDriver().findElement(By.xpath("//div[@class='form-group salesRepEmployeeNumber_form_group row']//div[@class='col-sm-9']//select[@id = 'field-salesRepEmployeeNumber']")));
        select1.selectByVisibleText(txt);
	    
	}
	public void enviarTexto(String txt) {
		getDriver().findElement(By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']//input")).sendKeys(txt + Keys.ENTER);
	    
	}
	

	public Boolean isElemento(String valor, By by) {
		espera(by);
		List<WebElement> lista = getDriver().findElements(by);
		int count=0;
		for (int i = 0; i< lista.size();i++) {
			if (lista.get(i).getText().equals(valor)) {
				count++;
			}
		}
		if (count >0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	public int obterQuantosProdutosForamAdicionadosNoCarrinho(By by) {
		espera(by);
		List<WebElement> lista = getDriver().findElements(by);
		return lista.size();
	}
	
	public int obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho(By by) {
		espera(by);
		List<WebElement> lista = getDriver().findElements(by);
		int count = 0;
		int total = 0;
		for (int i = 0; i< lista.size();i++) {
			count =  Integer.parseInt(lista.get(i).getAttribute("value"));
			total = total +count;
			
		}
		return total;
	}
	
	public Boolean isElementoSemEspera(String valor, By by) {
		List<WebElement> lista = getDriver().findElements(by);
		int count=0;
		for (int i = 0; i< lista.size();i++) {
			if (lista.get(i).getText().equals(valor)) {
				count++;
			}
		}
		if (count >0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void espera(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public void fecharPopUpAberta() {
		
	}
	public String obterTextoPopUp() {

		return  getDriver().findElement(By.className("alert-delete-multiple-one")).getText();

	}
    public String getMensagemDelete(){
        WebElement element = getDriver().findElement(By.xpath("//div[@data-growl='container']//span/p"));

        WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
	public void clicarEmDeletePopUp2(By by) {
        WebElement hoverButton = getDriver().findElement(by);
      
        Actions action = new Actions(getDriver());
        action.moveToElement(hoverButton).perform();
        
        action.moveToElement(hoverButton).click().perform();

     
    }
	
	
}
