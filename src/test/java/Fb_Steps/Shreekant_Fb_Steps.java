package Fb_Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Shreekant_Fb_Steps {

	WebDriver driver = null;
	
	@Given("initially we are on the goggle page")
	public void initially_we_are_on_the_goggle_page() {
	   
		System.out.println("===>>> We are on the google page <<<===");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@Then("user serch the proper facebook URL")
	public void user_serch_the_proper_facebook_url() throws InterruptedException {
	 
		driver.get("https://Facebook.com");
		
		Thread.sleep(3000);
	}

	@Then("user navigated to the facebook page")
	public void user_navigated_to_the_facebook_page() {		
		
		if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed()) {
			
			System.out.println("Pass: We are on the correct page");
		}
		else
		{
			
			System.out.println("Fail: not matching");
		}
		
	}

	@Then("user enter the valid userid")
	public void user_enter_the_valid_userid() {
	    
		driver.findElement(By.name("email")).sendKeys("9322599801");
		
	}

	@Then("user enter the valid password")
	public void user_enter_the_valid_password() throws InterruptedException {
	  
		driver.findElement(By.name("pass")).sendKeys("Ankita@123");
		
		Thread.sleep(2000);
	}

	@And("uer click the login button")
	public void uer_click_the_login_button() throws InterruptedException {
	 
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
	}

	@Then("facebook home page should open")
	public void facebook_home_page_should_open() throws InterruptedException {
	   
		
		if(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/span")).isDisplayed()) {
			
			System.out.println("Pass");
		}else {
			
			System.out.println("Fail");
		}
		
		Thread.sleep(5000);
	}

	@Then("user click logout")
	public void user_click_logout() throws InterruptedException {
	   
		
		
		driver.findElement(By.xpath("(//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='jroqu855 nthtkgg5'])[5]")).click();
	}

}
