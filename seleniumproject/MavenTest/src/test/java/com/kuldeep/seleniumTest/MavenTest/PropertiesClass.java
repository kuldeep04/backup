package com.kuldeep.seleniumTest.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	
	
	
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		File file = new File(System.getProperty("user.dir") + "/src/test/java/config/or.properties");
		FileInputStream input = new FileInputStream(file);
		properties.load(input);
		System.out.println(properties.getProperty("login.userName"));

	}

}
