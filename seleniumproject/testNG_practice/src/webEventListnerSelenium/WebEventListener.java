package webEventListnerSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver arg0) {
	Reporter.log("alert is accepted");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {

		Reporter.log("Alert is dismissed");
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("Element value changed to: " + arg0.toString());
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Clicked on: " + arg0.toString());
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Found Element By : " + arg0.toString());
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("Navigated back to previous page");
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("Navigated forward to next page");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Navigated to:'" + arg0 + "'");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		Reporter.log("Alert is Present"+driver.switchTo().alert().getText());
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("Value of the:" + arg0.toString()
		+ " before any changes made");
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Trying to click on: " + arg0.toString());
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Trying to find Element By : " + arg0.toString());
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("Navigating back to previous page");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("Navigating forward to next page");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Before navigating to: '" + arg0 + "'");
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("Exception occured: " + arg0);
		
	}

}
