package testNG_practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class CookieHandelling extends UtilsClass{
	
	@Test
	public void handelcookie(){
		openbrowser("FF", "https://www.mylescars.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies);
	}
}
