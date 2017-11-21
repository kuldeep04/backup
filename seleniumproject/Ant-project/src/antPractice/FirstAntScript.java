package antPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAntScript {
	
	public WebDriver driver;
		
	@Test
	public void TC_1(){
		System.setProperty("webdriver.gecko.driver", "D:/seleniumproject/testNG_practice/driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
