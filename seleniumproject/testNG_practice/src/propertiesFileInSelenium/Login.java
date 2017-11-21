package propertiesFileInSelenium;

import org.junit.Test;

public class Login extends TestBase{
				
	
	@Test
	public void loginTest(){
		System.out.println(OR.getProperty("browser"));
		System.out.println(OR.getProperty("url"));
		System.out.println(OR.getProperty("password"));
		System.out.println(OR.getProperty("useName"));
		System.out.println(OR.getProperty("login.submitButtob"));
		System.out.println(OR.getProperty("login.password"));
		System.out.println(OR.getProperty("login.userName"));
	}
	
}
