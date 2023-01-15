package Page_Factry_clases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook_Factry_Steps {

	WebDriver driver ;

	String expected_title = "facebook – log in or sign up";

	Facebook_PFactry facebok_login = null;

	@Given("initially user is on the web page")
	public void initially_user_is_on_the_web_page() {

		System.out.println(" Location ==> User on Google page");	

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@When("user enters the proper url")
	public void user_enters_the_proper_url() throws InterruptedException {
	
		driver.get("https://Facebook.com");

		Thread.sleep(2000);
		
		String actual_title = driver.getTitle().toLowerCase();

		System.out.println("Actual title is ==> " +actual_title);

		if(expected_title.contains(actual_title)) {

			System.out.println("Pass: we are on the correct Facebook page");
		}else {

			System.out.println("Fail: Please fill up the proper URl");
		}
	}


	@When("^user fills(.*) and (.*)$")
	public void user_fills_the_proper_usernameid_and_userpassid(String usernameid , String userpassid ) throws InterruptedException {

		facebok_login = new Facebook_PFactry(driver);

		facebok_login.fill_username(usernameid);
		facebok_login.fill_password(userpassid);


	}

	@Then("make the hit button on the submit")
	public void make_the_hit_button_on_the_submit() throws InterruptedException {

		facebok_login.press_login();

		
	}

	@Then("proper erroer mesages should be displayed")
	public void proper_erroer_mesages_should_be_displayed() {

		facebok_login.proper_error_msg();

		System.out.println("Pass: We got an eroor");

	}

	@Then("user navigaved to the back of the browser")
	public void user_navigaved_to_the_back_of_the_browser() {

		driver.close();
		driver.quit();

	}

}
