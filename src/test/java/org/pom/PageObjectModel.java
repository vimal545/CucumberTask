package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;

public class PageObjectModel extends BaseClass {
	
	public PageObjectModel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="com.mirrorfly:id/text_agree")
	
	private MobileElement click;
	
	public MobileElement getClick() {
		return click;
	}

}
