package Pom_For_Teligram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject_forSaanpchat {

	By text_gmail = By.xpath("//input[@name='username']");
	
	By text_password = By.xpath("//input[@name='password']");
	
	By btn_press = By.xpath("//button[@id='loginTrigger']");

	WebDriver driver = null;

	public PageObject_forSaanpchat(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void fill_gamil_id(String gmailid, String password) {

		driver.findElement(text_gmail).sendKeys(gmailid);

		driver.findElement(text_password).sendKeys(password);

	}

	public void btn_login() {

		driver.findElement(btn_press).click();
	}

	public void setup_close() {

		driver.close();
		driver.quit();
	}

	public void login_snapchat(String gmailid, String password) {

		driver.findElement(text_gmail).sendKeys(gmailid);

		driver.findElement(text_password).sendKeys(gmailid);

		driver.findElement(btn_press).click();
	}





}
