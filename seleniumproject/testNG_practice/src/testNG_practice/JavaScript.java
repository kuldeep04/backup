package testNG_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {

	public static WebDriver driver;
	public String geckodriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\geckodriver.exe";
	public static JavascriptExecutor	javascriptExecutor=(JavascriptExecutor)driver;
	/*******************
	 * FIND ELEMENET BY JAVASCRIPT
	 *************************************************/

	public static void findElementByJavaScript() {
		System.setProperty("webdriver.gecko.driver", "geckodriverpath");
		FirefoxDriver ff = new FirefoxDriver();
		WebElement loginbox = null;
		/****************** Find Elemnet **************************/
		ff.executeScript("return documents.getElementById()", loginbox);
		/****************** get Element Attribute ***********/
		ff.executeScript("document.getElementByID('Path of elementt')", loginbox);
		/******************** Total frame ****************************/
		ff.executeScript("document.frame.length;");
		/*
		 * Note:-Be ware of this one. It only works in IE, cant get it to work
		 * for Mozilla.
		 ******/
		/************Generate Alert POP window****************************/
		
			
			javascriptExecutor.executeScript("alert('Hello world');");
			
			/************Click Action****************************/
			
			
			javascriptExecutor.executeScript("alert('Hello world');");
			
			/************Refresh Browser****************************/
			javascriptExecutor.executeScript("History.go(0);");
			
			/************Scroll page****************************/
			javascriptExecutor.executeScript("Window.scrollBy(0,150)" );
	}
}
