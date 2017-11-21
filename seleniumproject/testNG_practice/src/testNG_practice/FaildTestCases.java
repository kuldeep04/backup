package testNG_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaildTestCases {
		
	@Test(retryAnalyzer = Retry.class)
	public void textGenX(){
		Assert.assertEquals("james", "abcd"); // ListenerTest fails
    }

    @Test(retryAnalyzer = Retry.class)
    public void testGenY() {
        Assert.assertEquals("hello", "axy"); // ListenerTest fails

    }

	
	
}
