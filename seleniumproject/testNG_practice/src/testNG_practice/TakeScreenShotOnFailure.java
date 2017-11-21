package testNG_practice;

import java.io.File;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TakeScreenShotOnFailure extends UtilsClass{

	public WebDriver driver = null;
	public String geckodriverpath = "D:\\seleniumproject\\MavenTest\\driver\\geckodriver.exe";
	public String chromedriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\chromedriver.exe";
	public String IEdriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\IEDriverServer.exe";

	@Test
	@Parameters({"browsername","URL"})
	public void TC_1(String browsername,String URL) {
		openbrowser(browsername, URL);
		driver.findElement(By.xpath("//a[@class='gb_']")).click();
	}

	@AfterMethod
	public void takeScreeShotOnFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				org.apache.commons.io.FileUtils.copyFile(sourcefile,
						new File("D://seleniumproject//testNG_practice//Screenshot//screenshot.png"));

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/************
	 * ALERT_Handling_with username and password
	 **************************************/
	public void userPasswordAlertHandelling() {
		driver.switchTo().alert()
				.authenticateUsing((Credentials) new UsernamePasswordCredentials("Kuldeep", "123456789"));
		UserAndPassword usrname = new UserAndPassword("username", "password");
		usrname.getPassword();
		usrname.getUsername();
	}

}