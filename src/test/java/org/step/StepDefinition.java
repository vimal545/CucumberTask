package org.step;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.PageObjectModel;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{

	@Given("webchat login page is displayed")
	public void webchat_login_page_is_displayed() {
	    
	}

	@When("I scan the QR code")
	public void i_scan_the_QR_code() {
	   
	}

	@Then("Name {string} should be displayed on top left corner")
	public void name_should_be_displayed_on_top_left_corner(String s) throws InterruptedException {
		
	
		launch("https://web.mirrorfly.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		WebElement displayed = driver.findElement(By.xpath("//div[@class='profile-img-name']"));
		if (displayed.equals(s)) {
			boolean result = displayed.isDisplayed();
			System.out.println(result);
		}	
	}

	@Given("Recent chat list header is displayed")
	public void recent_chat_list_header_is_displayed() {
		WebElement displayed = driver.findElement(By.xpath("//li[@class='chat-list-li ']"));
		boolean result = displayed.isDisplayed();
		System.out.println(result);
	}

	@When("I clicks on new chat icon")
	public void i_clicks_on_new_chat_icon() {
		driver.findElement(By.xpath("//i[@class='newchat-icon']")).click();
	}

	@Then("New chat tab is displayed")
	public void new_chat_tab_is_displayed() {
		WebElement displayed = driver.findElement(By.xpath("//i[@class='newchat-icon']"));
		boolean result = displayed.isDisplayed();
		System.out.println(result);
	}

	@Given("Again New chat tab is displayed")
	public void again_New_chat_tab_is_displayed() {
		WebElement displayed = driver.findElement(By.xpath("//i[@class='newchat-icon']"));
		boolean result = displayed.isDisplayed();
		System.out.println(result);
	}

	@When("I click on search field")
	public void i_click_on_search_field() throws InterruptedException {
		
		Thread.sleep(7000);
		WebElement search = driver.findElement(By.xpath("//div[@class='search']"));
		   search.click();
		   System.out.println("ok");
	}

	@When("Enter a search text {string}")
	public void enter_a_search_text(String keyword) throws InterruptedException {
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//div[@class='search']"));
		text.sendKeys(keyword);
	}

	@Then("search result should contain the entered text VimalVijayan")
	public void search_result_should_contain_the_entered_text_VimalVijayan() {
	
	}

}
 