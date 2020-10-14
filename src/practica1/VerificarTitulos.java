package practica1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerificarTitulos {
	public String url = "http://demo.guru99.com/test/newtours/";
	public String rutaDriver = "C:\\msedgedriver.exe";
	public WebDriver driver;
	
@BeforeTest
	public void iniciarNavegador() {
	System.setProperty("webdriver.edge.driver", rutaDriver);
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	}
	
  @Test
  public void validarTituloRegister() {
	 WebElement enlaceRegister = driver.findElement(By.linkText("REGISTER"));
	 String expectedContent = "REGISTER";
	 Assert.assertEquals(enlaceRegister.getText(), expectedContent);
  }
  
  @Test
  public void validarTituloSupport() {
	  WebElement enlaceSupport = driver.findElement(By.linkText("SUPPORT"));
	  Assert.assertEquals(enlaceSupport.getText(), "SUPPORT");
  }
  
@AfterTest
	public void cerrarNavegador() {
	driver.close();
	}
}
