package POMPagesPrimusBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Yahho_POM {
	
	WebDriver driver = null;
	
	By enters_emil_address = By.xpath("//input[@id='login-username']");
    By click_next = By.xpath("//input[@id='login-signin']");
	By erreor_msg = By.xpath("//p[@id='username-error']");
	
	public Yahho_POM(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void enters_mail(String entersgmail) {
		
		driver.findElement(enters_emil_address).sendKeys(entersgmail);
		
	}
	
	public void click_next_btn() {
		
		driver.findElement(click_next).click();
	}
	
	public void error_msg_displayed() {
		
		driver.findElement(erreor_msg).isDisplayed();
	}
	public void logout() {
		
		driver.close();
		driver.quit();
	}
	
	public void login_yahho(String entersgmail) {
		
		driver.findElement(enters_emil_address).sendKeys(entersgmail);
		driver.findElement(click_next).click();
		driver.findElement(erreor_msg).isDisplayed();
		
	}
	
}
