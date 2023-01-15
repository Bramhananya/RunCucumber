package Pom_For_Teligram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_Teligram {
	
	By enters_gmail = By.xpath("//input[@name='username']");
	
	By enters_passid = By.xpath("//input[@name='password']");
	
	By press_login = By.xpath("//input[@type='submit']");
	
	By confirming_error_message = By.xpath("//li[contains(text(),'Invalid')]");
	
	WebDriver driver = null ;
	

	public Pom_Teligram(WebDriver driver) {
		
		this.driver  = driver;
	}
	

	public void enters_mail(String gmailid) {
		
		driver.findElement(enters_gmail).sendKeys(gmailid);
	}

	public void enters_passid(String password) throws InterruptedException {
		
		driver.findElement(enters_passid).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	public void preess_login() {
		
		driver.findElement(press_login).click();
	}
	
	public void error_displaye_confirm() {
		
		driver.findElement(confirming_error_message).isDisplayed();
	}
	
	public void setUp_Close(){
		
		driver.close();
		driver.quit();
	}
	
	public void login_teigram(String gmailid, String password) {
		
		driver.findElement(enters_gmail).sendKeys(gmailid);
		driver.findElement(enters_passid).sendKeys(password);
		driver.findElement(press_login).click();
	}
	
	
	
	
	
	
	
}
