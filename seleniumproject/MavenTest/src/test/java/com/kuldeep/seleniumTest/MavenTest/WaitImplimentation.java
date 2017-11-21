package com.kuldeep.seleniumTest.MavenTest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitImplimentation {

	public WebDriver driver;

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.pollingEvery(5, TimeUnit.SECONDS);
		wait1.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

	}

	public WebElement fluentWait() {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(180, TimeUnit.SECONDS)
				.pollingEvery(30, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		return wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath(""));
			}
		});

	}

	public void fluentwait() {
		WebElement wait2 = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	}

	/* ready state wait */
	public void javaScriptWait() {
		ExpectedCondition<Boolean> expectedcondition = new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver arg0) {

				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(expectedcondition);
		} catch (Throwable error) {
			System.out.println("Time out waiting for page load request " + 60 + " seconds");
			Assert.assertFalse(true, "Time out waiting for page load request to complete");
		}
	}

	public void pageLoadTimeOut() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
}
