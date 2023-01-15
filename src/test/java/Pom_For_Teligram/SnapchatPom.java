package Pom_For_Teligram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SnapchatPom {

	WebDriver driver = null;

	PageObject_forSaanpchat login_snapchat = null;

	String expected_title = "log in • snapchat";

	String exp_error= "That's not the right password.";
  
	@Given("i am on the initial page")
	public void i_am_on_the_initial_page() {

		System.out.println("===>>> Initially i am on the Starting page <<<===");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

	}


	@Then("i passes the valid URL of the sanpchat")
	public void i_passes_the_valid_url_of_the_sanpchat() throws InterruptedException  {

		driver.navigate().to("https://accounts.snapchat.com/");

		String actual_text = driver.getTitle().toLowerCase();

		System.out.println("The title is ===>>> " + actual_text);

		if(expected_title.contains(actual_text)) {

			System.out.println("Pass: Text matching");
		}else {

			System.out.println("Fail: Not matching");
		}

		Thread.sleep(3000);

		try {

			if(driver.findElement(By.xpath("//h1[@class='accounts]")).isDisplayed()) {

				System.out.println("Pass: This is Sanpchat Page");
			}

		} catch (Exception e) {

			System.out.println("Fail: This is not an Snapchat page");
			
			System.out.println("Pass: We successfully handled those error");
		}

	}

	@And("^passing  (.*) and (.*)$")
	public void passing_the_ankita_321gmail_com_and_ankita(String gmailid, String password) throws InterruptedException {

		login_snapchat = new PageObject_forSaanpchat(driver);

		login_snapchat.fill_gamil_id(gmailid, password);

		Thread.sleep(2000);
	}

	@Then("i press the enter button")
	public void i_press_the_enter_button() throws InterruptedException {

		login_snapchat.btn_login();

		Thread.sleep(3000);
	}

	@Then("i should see the proper error messages")
	public void i_should_see_the_proper_error_messages() throws InterruptedException {

		String actual_get_error = driver.findElement(By.xpath("//div[@id='error_message']")).getText().toLowerCase();

		System.out.println("Text id ===>>> " + actual_get_error);

		Thread.sleep(3000);

		if(exp_error.contains(actual_get_error)) {

			System.out.println("Pass: We got an proper error");
		}else {

			System.out.println("Fail: We doesnt get error");
		}
	}

	@Then("i close the current window browser")
	public void i_close_the_current_window_browser() {

		driver.close();
		driver.quit();
		
		System.out.println("Browsers closed successfully....");

	}
}
