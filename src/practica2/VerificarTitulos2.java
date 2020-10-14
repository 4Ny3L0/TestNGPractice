package practica2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerificarTitulos2 {
	public String url = "http://demo.guru99.com/test/newtours/";
	public String pathDriver = "C:\\msedgedriver.exe";
	public WebDriver driver;
	
  @BeforeTest
  public void iniciarNavegador() {
	  System.setProperty("webdriver.edge.driver", pathDriver);
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }
  @BeforeMethod
  public void verifyTitleHomePage() {
	  String titleHome = "Welcome: Mercury Tours"; 
	  Assert.assertEquals(driver.getTitle(), titleHome);
  }
	
  @Test(priority = 0)
  public void verifyRegisterTitle() {
	  WebElement linkRegister = driver.findElement(By.linkText("REGISTER"));
	  String titleRegister = "Register: Mercury Tours";
	  
	  linkRegister.click();
	  Assert.assertEquals(driver.getTitle(), titleRegister);
	  	    
  }
  
  
  @Test(priority = 1)
  public void verifySupportTitle() {
	  WebElement linkSupport = driver.findElement(By.linkText("SUPPORT"));
	  String titleSupport = "Under Construction: Mercury Tours";
	  linkSupport.click();
	  Assert.assertEquals(driver.getTitle(), titleSupport);
  }
  @AfterMethod
  public void goToHomepage() {
	driver.findElement(By.linkText("Home")).click();  
  }
  
  @AfterTest
  public void cerrarNavegador() {
	  //driver.close();
  }
}
