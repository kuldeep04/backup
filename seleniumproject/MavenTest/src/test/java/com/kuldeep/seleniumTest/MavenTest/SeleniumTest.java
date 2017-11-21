package com.kuldeep.seleniumTest.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SeleniumTest {

	public WebDriver driver = null;
	public String geckodriverpath = "D:\\seleniumproject\\MavenTest\\driver\\geckodriver.exe";
	public String chromedriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\chromedriver.exe";
	public String IEdriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\IEDriverServer.exe";

	@Test
	public void TC_1() {
		System.setProperty("webdriver.gecko.driver", geckodriverpath);
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Google launched");
	}

}
