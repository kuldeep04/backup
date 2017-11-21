package com.kuldeep.seleniumTest.MavenTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {
	
	WebDriver driver;
	
	public void windowHandle(){
		Set<String> windowvalue = driver.getWindowHandles();
		Iterator<String> itr = windowvalue.iterator();
		ArrayList<String> ids=new  ArrayList<String>();
		while(itr.hasNext()){
			ids.add(itr.next());
		}
		driver.switchTo().window(ids.get(3));
		
		Point windowpoaition = driver.manage().window().getPosition();
		windowpoaition.getY();
		windowpoaition.getX();
		
		Point webelementlocation = driver.findElement(By.xpath("")).getLocation();
		webelementlocation.getX();
		webelementlocation.getY();
		
		
			}
	
	public void moveToElement(){
		/*Mouse hower*/
	Actions	action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("")));
	
	/*Drag & drop*/
	Actions	action1=new Actions(driver);
	WebElement source = driver.findElement(By.xpath(""));
	WebElement target=driver.findElement(By.xpath(""));
	action1.dragAndDrop(source, target);
	
	
	
	
	
	}
		
}
