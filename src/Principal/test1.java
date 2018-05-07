package Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	private WebDriver driver;
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.santanderrio.com.ar/banco/online/personas");
		
		WebElement link = driver.findElement(By.id("query"));
		link.click();
		link.sendKeys("banco");

	  
	  
	  
	  
	  
	  
	  
	  
  }
}
