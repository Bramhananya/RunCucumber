package Fb_Steps;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Ddf_Sheekant_fb {
	static Logger log = Logger.getLogger(Ddf_Sheekant_fb.class.getName());  
	WebDriver driver ;

	@Given("user on the google page")
	public void user_on_the_google_page() {

		System.out.println("===>>> We are on the google page <<<===");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Then("user enter correct url of the fb page")
	public void user_enter_correct_url_of_the_fb_page() throws InterruptedException {

		driver.get("https://Facebook.com");
		
		
		Thread.sleep(2000);
		
	String current_page_url = 	driver.getCurrentUrl();
	
	System.out.println(" The currenty pagr url is =>> " + current_page_url);
	
	
		Thread.sleep(3000);
	}

	@Then("^user enters (.*) and (.*)$ ")
	
	public void user_enters_shreekant_and_sherr(String uuserrrid, String passsword) throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uuserrrid);

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(passsword);

		Thread.sleep(2000);
	}

	@Then("shreekant click to the login btn")
	public void shreekant_click_to_the_login_btn() throws InterruptedException {

		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
	}

	@Then("shreekant should get error msg")
	public void shreekant_should_get_error_msg() {

		if(driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed()) {

			System.out.println("Pass: We got an appropriate error");
		}else {

			System.out.println("fail: try again later");
		}

	}

	@Then("i closing the broweser")
	public void i_closing_the_broweser() {

		driver.close();
		driver.quit();
	}



}
