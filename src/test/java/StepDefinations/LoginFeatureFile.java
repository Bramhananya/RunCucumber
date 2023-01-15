package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureFile {
	
	WebDriver driver;
	
	@Given("user on the starting page")
	public void user_on_the_main_page() {
	   
		System.out.println("Inside Step => User came On Main Page.");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:facebook.com");
		
		String title_of_the_page  = driver.getTitle();
		System.out.println(title_of_the_page);
	}

	@When("user enters user id and password")
	public void user_enters_user_id_and_password() {
	    
		System.out.println("Inside Step => Id and Pass eEnters Success.");
		
		driver.findElement(By.id("email")).sendKeys("9322599801");
		driver.findElement(By.name("pass")).sendKeys("Ankita@123");
	}

	@And("clicks the submit button")
	public void clicks_the_submit_button() {
	 
		System.out.println("Inside Step => Clicked Button Success.");
		
		driver.findElement(By.name("login")).click();
	}

	@Then("main fb page should be displayed")
	public void main_fb_page_should_be_displayed() {
	   
		System.out.println("Inside Step => Main Page Displyed Success." );
		
		if(driver.findElement(By.xpath("//span[contains(text(),'Welcome to Facebook')]")).isDisplayed()) {
			
			System.out.println(" Main page displayed successfully... Pass");
		}else {
			System.out.println("Please check the code again...Fail.");
		}
		
		driver.close();
		driver.quit();
	}


}
