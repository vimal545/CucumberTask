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
		  DesiredCapabilities des=new DesiredCapabilities();
		   des.setCapability("deviceName", "Mi A1");
		   des.setCapability("platformName", "Android");
		   des.setCapability("platformVersion", "9");
		   des.setCapability("appPackage", "com.mirrorfly");
		   des.setCapability("appActivity", "com.contusfly.newchat.ChatActivity");
		   URL u=new URL("http://localhost:4723/wd/hub");
		   AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(u,des);
	}
	
	public static void launch(String s) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project\\div\\chromedriver.exe");

 driver=new ChromeDriver();
 
driver.get(s);


}
	
	public static void fill(MobileElement w,String s) {
		
      w.sendKeys(s);
	}
	
	public static void click(MobileElement w) {
       w.click();
	}
	
}
