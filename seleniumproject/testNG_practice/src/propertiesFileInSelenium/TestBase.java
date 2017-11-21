package propertiesFileInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public Properties OR;
	public File file;
	public FileInputStream filereader;
	
	public void setUp() throws IOException{
		OR=new Properties();
		 file=new File(System.getProperty("user.dir")+"src/config/config.properties");
		 filereader=new FileInputStream(file);
		 OR.load(filereader);
		 System.out.println(OR.getProperty("useName"));
		 
		 
		 OR=new Properties();
		 file=new File(System.getProperty("user.dir")+"src/config/or.properties");
		 filereader=new FileInputStream(file);
		 OR.load(filereader);
		 System.out.println(OR.getProperty("login.userName"));
	}
	@BeforeClass
	public  void init() throws IOException{
		setUp();
	}
	
}
