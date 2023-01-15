package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookProviderSteps {

	
WebDriver driver;
	
	@Given("user on the main page")
	public void user_on_the_main_page() throws InterruptedException {
	   
		System.out.println("Inside Step => User came On Main Page.");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:Facebook.com");
		
		Thread.sleep(2000);
		String title_of_the_page  = driver.getTitle();
		System.out.println(title_of_the_page);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user_id_and_password( String userid, String password ) throws InterruptedException {
	    
		System.out.println("Inside Step => Id and Pass eEnters Success.");
		
		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.name("pass")).sendKeys(password);
		
		Thread.sleep(3000);
	}

	@And("hits the submit button")
	public void clicks_the_submit_button() throws InterruptedException {
	 
		Thread.sleep(3000);
		System.out.println("Inside Step => Clicked Button Success.");
		
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("main fb page must be displayed")
	public void main_fb_page_should_be_displayed() throws InterruptedException {
	   
		Thread.sleep(3000);
		System.out.println("Inside Step => Main Page Displyed Success." );
		
       boolean results =	driver.findElement(By.xpath("(//span[@class='b6ax4al1 lq84ybu9 hf30pyar om3e55n1'])[14]")).isDisplayed();
		System.out.println("Test case => " + results);
       
		Thread.sleep(3000);
			
	}
	
	     
   }


