package test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\msedgedriver.exe";
    public WebDriver driver ; 
     @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
     @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching Edge browser"); 
          System.setProperty("webdriver.edge.driver", driverPath);
          driver = new EdgeDriver();
          driver.get(baseUrl);
      }
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
}
