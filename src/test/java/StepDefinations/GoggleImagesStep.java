package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoggleImagesStep {

	WebDriver driver;
	
	@Given("user is on Google page")
	public void user_is_on_google_page() {
	    
		System.out.println("User is on Google page");
	}

	@When("user opens browser")
	public void user_opens_browser() {
	   
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https:Google.com");
		
	}

	@And("clicks on the Google Images link")
	public void clicks_on_the_google_images_link() {
	   
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Google images link should be open")
	public void google_images_link_should_be_open() {
	   
     	
    if(driver.findElement(By.xpath("//img[@alt='Google Images']")).isDisplayed()) {
    			
		System.out.println("Pass : Link is  working");
	}else {
		System.out.println("Fail: not working");
	}
		
		driver.close();
		driver.quit();
	}

	
}
