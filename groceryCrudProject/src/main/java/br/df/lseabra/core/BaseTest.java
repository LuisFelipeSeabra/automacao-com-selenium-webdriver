package br.df.lseabra.core;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import br.df.lseabra.page.IndexPage;



public class BaseTest {
	private IndexPage page = new IndexPage();
	
	@Before
	public void Login() {
		page.acessarTelaInicial();

	}
	@ClassRule 
	public static TestName testName = new TestName();

	@AfterClass
	public static void shutDown() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo =  ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target"+ File.separator +"screenshot/"
				+ File.separator + testName.getMethodName()+ ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.killDriver();
	}

	}
	
}
