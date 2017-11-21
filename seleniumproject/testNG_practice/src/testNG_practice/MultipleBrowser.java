package testNG_practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser extends UtilsClass{

	public WebDriver driver;
	public String geckodriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\geckodriver.exe";
	public String chromedriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\chromedriver.exe";
	public String IEdriverpath = "D:\\seleniumproject\\testNG_practice\\driver\\IEDriverServer.exe";

	@Parameters({"browsername","URL"})
	@Test
	public void multibrowser(String browsername, String URL){
		openbrowser(browsername, URL);
		
	}

}
