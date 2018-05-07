package Principal;

		import static org.junit.Assert.assertTrue;
		import org.junit.Before;
		import org.junit.jupiter.api.BeforeEach;
		import org.junit.jupiter.api.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;



		public class SampleTest {
			
			
			private WebDriver driver;
			
			@BeforeEach
			
			public void setUp() {
				
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe" );
				driver = new ChromeDriver();
				driver.get("https://www.santanderrio.com.ar/banco/online/personas");	
			}

			@Test
			public void clicarLink() {
				

				WebElement link = driver.findElement(By.id("query"));
				link.click();
				link.sendKeys("banco");
				
				}
			
			

		}
		 

