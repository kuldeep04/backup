package testNG_practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkedIn_SendRequest extends UtilsClass {

	public static void main(String[] args) throws InterruptedException {
		LinkedIn_SendRequest linkendin = new LinkedIn_SendRequest();
		linkendin.linkedInlogin();
		linkendin.sendRequest();
	}

	public void linkedInlogin() throws InterruptedException {
		openbrowser("CH", "https://www.linkedin.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("login-email")).clear();
		driver.findElement(By.id("login-email")).sendKeys("kuldeep04081990@gmail.com");
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).sendKeys("kuldeep0408");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(3000);
		WebElement homeicon = driver.findElement(By.id("feed-tab-icon"));
		if (homeicon.isDisplayed()) {
			System.out.println("User Logged in successfully");
		}

	}

	public void sendRequest() throws InterruptedException {
		driver.findElement(By.id("mynetwork-tab-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("mn-pymk-list__cards"));
		java.util.List<WebElement> Ulelement = driver.findElements(By.xpath("//ul[@class='mn-pymk-list__cards']/li"));
		int lisize = Ulelement.size();
		System.out.println(lisize);
		int i;
		for (i = 0; i <= lisize; i++) {
			@SuppressWarnings("unused")
			WebElement contactdiv = Ulelement.get(i).findElement(By.className("mn-person-info__card-details mt1"));
			// contactdiv.findElement(arg0)
		}
	}

}
