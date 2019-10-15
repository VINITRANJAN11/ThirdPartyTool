package autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmailWithAttachment {

		
		public WebDriver driver = null;
		public static String Chrome_Key="webdriver.chrome.driver";
		public static String Chrome_Value="C:\\Seleniumjars\\chromedriver.exe";
		public WebDriverWait wait =null;
		
		@BeforeMethod
		public void precondition() {
			System.setProperty(Chrome_Key, Chrome_Value);
			driver = new ChromeDriver();
			driver.get("http://www.gmail.com");
			wait = new WebDriverWait(driver,10); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		}	
		@Test
		public void composeEmailWithAttachment() {
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("vinitranjan11@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		    driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("IAMBACK@2020");
		    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();		
		    wait.until(ExpectedConditions.titleContains("Inbox"));
		    WebElement composeBtn =driver.findElement(By.cssSelector("#\\:l6 > div > div"));
		    composeBtn.click();                                
		}
		
		
		
		
	/*
	 * @AfterMethod public void closeBrowser() { driver.close(); }
	 */

	}


