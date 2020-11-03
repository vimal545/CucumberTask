package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Page2 extends BaseClass {
	public Page2() {
		PageFactory.initElements(driver, this);
	}

	
	
	
}
