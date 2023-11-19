package com.Cucumber.NewLimeRoad;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Base_LimeRoad {

	public static JavascriptExecutor js;
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Robot rbt;
	public static Actions act;
	 
	
	public static void getDriver (String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("invalid browser");
		}	
	}
		
		public static void getUrl (String url){
			try {
				driver.get(url);
			} catch (Exception e) {
			System.out.println("url not valid");
		}
		
		}
		
		public static void clickOnWebelement(WebElement element) {
			element.click();	
			
		}
		
		public static void moveToElement(WebElement element) {
			act=new Actions(driver);
			act.moveToElement(element).build().perform();
		
}
		public static  void javaScript(String value) {
			if(value.equalsIgnoreCase("down")) {
				js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500);");
			}else if (value.equalsIgnoreCase("up")) {
				js.executeScript("window.scrollBy(0,-300);");
			}
	}
	
}
