package Page_Factry_clases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_PFactry {
	
	WebDriver driver = null;

	@FindBy(xpath ="//input[@id='email']")
	WebElement text_username ;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement text_password ;

	@FindBy(xpath = "//button[@id='loginbutton']")
	WebElement press_login_button ;

	@FindBy(xpath = "//div[@class='_9ay7']")
	WebElement erreor_msg_displayed;

	public Facebook_PFactry(WebDriver driver) {

		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	public void fill_username(String usernameid) {

		text_username.sendKeys(usernameid);
	}
	public void fill_password(String userpassid) {

		text_password.sendKeys(userpassid);
	}
	public void press_login() {

		press_login_button.click();
	}
	
	public void proper_error_msg() {

		erreor_msg_displayed.isDisplayed();
	}


}
