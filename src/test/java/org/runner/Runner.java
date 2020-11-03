package org.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.base.BaseClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pom.Page2;
import org.pom.PageObjectModel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = {""},dryRun = true,plugin = {"pretty" 
		,"html:\\src\\test\\resources\\Reporting",
		"junit:\\src\\test\\resources\\Reporting\\cucumber.xml",
         "json:\\src\\test\\resources\\Reporting\\cucumber.json"})

public class Runner {
	
		
   

   
	}

