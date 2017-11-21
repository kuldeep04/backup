package propertiesFIleInselenium;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;

public class TestBase {
		
	public Properties OR;
	public File file;
	public java.io.FileReader filereader;
	
	public void setUp() throws IOException{
		OR=new Properties();
		 file=new File(System.getProperty("user.dir")+"src/test/java/config/config.properties");
		 filereader=new java.io.FileReader(file);
		 OR.load(filereader);
		 
		 
		 OR=new Properties();
		 file=new File(System.getProperty("user.dir")+"src/test/java/config/or.properties");
		 filereader=new java.io.FileReader(file);
		 OR.load(filereader);
	}
	@BeforeClass
	public  void init() throws IOException{
		setUp();
	}
}
