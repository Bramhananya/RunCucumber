package Pom_For_Teligram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TeligramLoginSteps {

	Pom_Teligram login_teligram = null ;
	
	WebDriver driver = null;
	
	String expected_error_msg = "Invalid Username/Password";
	
	
	@Given("user is on the main page")
	public void user_is_on_the_main_page() {
	 
	System.out.println("===>>> User is ont he Google Page  <<<===");	
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Then("i am going to enter the valid URL of Teligram")
	public void i_am_going_to_enter_the_valid_url_of_teligram() throws InterruptedException {
	   
		driver.navigate().to("https://telegr.am/user_mgt/login");
		Thread.sleep(2000);
	}

	@Then("^i enters(.*) and (.*)$")
	public void i_enters_gmailid_and_password(String gmailid,String password) throws InterruptedException {
	  
		 login_teligram = new Pom_Teligram(driver);
		 
		 login_teligram.enters_mail(gmailid);
		 login_teligram.enters_passid(password);
		 
		 Thread.sleep(1000);
	}

	@Then("i pressing the login button")
	public void i_pressing_the_login_button() {
	  
		login_teligram.preess_login();
	}

	@Then("i should see the error message")
	public void i_should_see_the_error_message() throws InterruptedException {
	   
	//    login_teligram.error_displaye_confirm();
	    	
	   String actual_error_msg =  driver.findElement(By.xpath("//li[contains(text(),'Invalid Username/Password')]")).getText().toLowerCase();
	   
	   System.out.println(actual_error_msg);
	   
	   Thread.sleep(3000);
	   
	   if(expected_error_msg.contains(actual_error_msg)) {
		   
		   System.out.println("Pass: We got an Appropriate error msg");
	   }else {
		   
		   System.out.println("Fail: NOt getting error msg");
	   }
	}
	
	@Then("i am going to close the browser")
	public void i_am_going_to_close_the_browser() {
	   
		driver.close();
		driver.quit();
		
		System.out.println("Here my test case is completed");
		
	}
}
