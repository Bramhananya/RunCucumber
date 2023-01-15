package POMPagesPrimusBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Primus_Bank_POM {

	WebDriver driver = null;
	LoginPrimus_POM primus_POM = null;
	String expected_title ="primus bank";

	@Before
	@Given("initially i am on the google page")
	public void initially_i_am_on_the_google_page() {

		System.out.println("We are on the Google_page");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		

	}

	@When("I enters the valid URL of the PrimusBank")
	public void i_enters_the_valid_url_of_the_primus_bank() {

		driver.get("http://primusbank.qedgetech.com");	


		String actual_title= driver.getTitle().toLowerCase();
		System.out.println("Title of the page is ==>" + actual_title);

		if(expected_title.contains(actual_title)) {

			System.out.println("Pass: Title is same");
		}else {

			System.out.println("Fail: Title is mismacted, Please try again later");
		}
	}

	@Then("PrimusBank Home page should be open")
	public void primus_bank_home_page_should_be_open() {
		try {

			if(driver.findElement(By.xpath("//img[@src='images/mainlinks_02.jpg']")).isDisplayed()) {
				System.out.println("Pass: we are on he right page.");
			}

		} catch (Exception e) {
			System.out.println("Fail: enters the new valid URL");
		}
	}

	@When("^i fill (.*) and (.*)$")
	public void i_fill_the_userid_of_the_primus_bank(String username ,  String passsword) throws InterruptedException {

		primus_POM = new LoginPrimus_POM(driver);

		primus_POM.enter_username(username);
		primus_POM.enter_password(passsword);

		Thread.sleep(2000);
	}


	@Then("hiting the login button")
	public void hiting_the_login_button() throws InterruptedException {

		primus_POM.login_button();

		Thread.sleep(3000);
	}

	@Then("Primus bank should shows the Alert message")
	public void primus_bank_should_shows_the_alert_message() {

		System.out.println("Pass: Alert is displayed");
	}

	@When("I handled alert")
	public void i_handled_alert() throws InterruptedException {

		driver.switchTo().alert().accept();

		System.out.println("Pass: Alert Handled successfully...");

		Thread.sleep(2000);
	}

	@After
	@Then("IClose the browser")
	public void i_close_the_browser() {

		driver.close();
		driver.quit();
	}

}
