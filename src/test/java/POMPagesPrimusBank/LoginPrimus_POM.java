package POMPagesPrimusBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPrimus_POM {

	WebDriver driver = null;

	By text_useridname = By.xpath("//input[@name='txtuId']");

	By text_passworrd = By.xpath("//input[@name='txtPword']");

	By btn_login = By.xpath("//input[@name='login']");


	public LoginPrimus_POM(WebDriver driver) {

		this.driver = driver;
	}

	public void enter_username (String username) {

		driver.findElement(text_useridname).sendKeys(username);
	}

	public void enter_password(String passsword) {

		driver.findElement(text_passworrd).sendKeys(passsword);
	}

	public void login_button() {

		driver.findElement(btn_login).click();

	}

	public void login(String username, String passsword) {

		driver.findElement(text_useridname).sendKeys(username);
		driver.findElement(text_passworrd).sendKeys(passsword);
		driver.findElement(btn_login).click();
	}

}


