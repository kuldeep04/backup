package testNG_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestClass {

	public WebDriver driver;

	public static void main(String [] args){
		TestClass.even(4);
	}
	
	public static void even(int x){
		switch(x%2){
		case 0:
			System.out.println("ODD");
			break;
		case 1:
			System.out.println("Even");
			break;
		}
	}
}
