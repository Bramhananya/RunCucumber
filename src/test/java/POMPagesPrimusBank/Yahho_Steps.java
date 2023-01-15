package POMPagesPrimusBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yahho_Steps {
	
	WebDriver driver = null;
	
	String expected_title = "yahoo";
	
	Yahho_POM login_yahho = null;
	
	String expected_error = null;
	
	@Given("initially user on the google page of Yahoo")
	public void initially_user_on_the_google_page_of_yahoo() {
	  
		System.out.println("We are ont ther Google Page");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Then("i enters the proper Yahoo URL")
	public void i_enters_the_proper_yahoo_url() {
	   
		driver.get("https://login.yahoo.com/");
		
		String actual_title =driver.getTitle().toLowerCase();
		
		System.out.println("Actual title is ==> "+ actual_title);
		
		if(expected_title.contains(actual_title)) {
			
			System.out.println("Pass: we are ont he current page");
		}else {
			
			System.out.println("Fail: Please try again later");
		}
	}
	@When("^user filled(.*)$")
	public void user_filled_ankita_123gmail_com(String Gamail) throws InterruptedException {
	 
		 login_yahho = new Yahho_POM(driver);
		 
		 login_yahho.enters_mail(Gamail);
		 
		 Thread.sleep(3000);		 
	}

	@And("user click on the next button")
	public void user_click_on_the_next_button() throws InterruptedException {
	    
		login_yahho.click_next_btn();
	
		Thread.sleep(3000);
	}

	@Then("user should get the error message")
	public void user_should_get_the_error_message() {
	 
		if(login_yahho.equals(expected_error)) {
			
			System.out.println("Pass: We got an proper error");
		}else {
			
			System.out.println("Fail: Not getting error");
		}

	}

	@And("user close the browser")
	public void user_close_the_browser() {
	   
	driver.close();
	driver.quit();
	}

	
}
