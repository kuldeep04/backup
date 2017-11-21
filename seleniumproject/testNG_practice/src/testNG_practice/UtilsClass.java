package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilsClass {
	
	public WebDriver driver;
	public String geckodriverpath="D:\\seleniumproject\\testNG_practice\\driver\\geckodriver.exe";
	public String chromedriverpath="D:\\seleniumproject\\testNG_practice\\driver\\chromedriver.exe";
	public String IEdriverpath="D:\\seleniumproject\\testNG_practice\\driver\\IEDriverServer.exe";
	
	
	public void openbrowser(String browsername, String URL){
		if(browsername.equalsIgnoreCase("FF")){
		System.setProperty("webdriver.gecko.driver",geckodriverpath);
		driver=new FirefoxDriver();
		driver.get(URL);
		}else if(browsername.equalsIgnoreCase("CH")){
			System.setProperty("webdriver.chrome.driver",chromedriverpath);
			driver=new ChromeDriver();
			driver.get(URL);
		}else{
			System.setProperty("webdriver.IE.driver",IEdriverpath);
			driver=new InternetExplorerDriver();
			driver.get(URL);
		}
	}
	
	public void navigaterefresh(){
		driver.navigate().refresh();
		
	}
	public void navigatetourlrefresh(){
		driver.navigate().to(driver.getCurrentUrl());
	}
	public void getrefresh(){
		driver.get(driver.getCurrentUrl());
	}
	
}
