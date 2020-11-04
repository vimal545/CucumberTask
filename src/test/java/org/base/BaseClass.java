package org.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void get() throws MalformedURLException {
		  
	}
	
	public static void launch(String s) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project\\div\\chromedriver.exe");

 driver=new ChromeDriver();
 
driver.get(s);
driver.manage().window().maximize();


}
	
	public static void fill(MobileElement w,String s) {
		
      w.sendKeys(s);
	}
	
	public static void click(MobileElement w) {
       w.click();
	}
	
}
