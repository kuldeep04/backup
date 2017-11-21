package propertiesFIleInselenium;

import org.testng.annotations.Test;

public class Login extends TestBase{
			
	
	@Test
	public void loginTest(){
		System.out.println(OR.get("browser"));
		System.out.println(OR.get("url"));
		System.out.println(OR.get("password"));
		System.out.println(OR.get("useName"));
		System.out.println(OR.get("login.submitButtob"));
		System.out.println(OR.get("login.password"));
		System.out.println(OR.get("login.userName"));
	}
}
