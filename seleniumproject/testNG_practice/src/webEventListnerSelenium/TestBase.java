package webEventListnerSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver driver;
	public EventFiringWebDriver eventdriver;
	public WebEventListener eventListner;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver=new ChromeDriver();
		eventdriver=new EventFiringWebDriver(driver);
		eventdriver.register(eventListner);
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}
}
