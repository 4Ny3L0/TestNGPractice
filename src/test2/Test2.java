package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	public String url = "http://demo.guru99.com/test/newtours/";
	public String rutaDelDriver = "C:\\msedgedriver.exe";
	public WebDriver driver; 
  @Test
  public void verifyHomePageTitle() {
	  System.out.println("Launching the Edge browser");
	  System.setProperty("webdriver.edge.driver", rutaDelDriver);
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  String tituloEsperado = "Welcome: Mercury Tours";
	  String tituloActual = driver.getTitle();
	  
	  Assert.assertEquals(tituloActual, tituloEsperado);
  }
  
 
}
