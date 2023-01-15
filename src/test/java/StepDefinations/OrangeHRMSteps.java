package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {

	WebDriver driver ; 
	
	@Given("User is on Googole page")
	public void user_is_on_googole_page() {
	    
		System.out.println("User is on  OrangeHRM Page");
	}

	@When("user enters OrangeHRM Url")
	public void user_enters_facebook_url() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	 
	    driver.get("http://orangehrm.qedgetech.com");
		
	    String titlt_of_the_page = driver.getTitle();
	    
	    System.out.println("The above page title is ==> " + titlt_of_the_page);
	    
		Thread.sleep(3000);
	}

	@And("OrangeHRM Login page should be displayed")
	public void facebook_login_page_should_be_displayed() {
	    
		if(driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed()) {
			
			System.out.println("OrangeHRM page open Successfully... : Pass");
		}else {
			
			System.out.println("Fail ; Plese  Reenter Valid Url");
		}
	}

	@Then("User enters valid uerid")
	public void user_enters_valid_uerid() {
	   
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	}

	@And("User enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");
		Thread.sleep(3000);
	}
	
	@And("hits the login button")
	public void hits_the_login_button() {
	   
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
	}
	
		@Then("user account should be open successfully")
		public void user_accout_should_be_open_successfully() throws InterruptedException {
		   
			if(driver.findElement(By.xpath("//a[@class='panelTrigger']")).isDisplayed()) {
				
				System.out.println("Pass : Account Opened Successfully...");
			}else {
				
				System.out.println("Fail : Test case is failed ...");
			}
			
			boolean result = driver.findElement(By.xpath("//a[@class='panelTrigger']")).isDisplayed();
            System.out.println("Pass : " + result); 
			
		Thread.sleep(3000);		
	}
		
		@When("i clicked logout")
		public void i_clicked_logout() throws InterruptedException {
		   
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
		}

		@Then("login page  should immediatly displayed")
		public void login_page_should_immediatly_displayed() {
		    		
			if(driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed()) {
				
				System.out.println("Pass : test case ");
			}else {
				
				System.out.println("Fail : test case");
			}
			
		}
		
		@Then("close the browser")
		public void close_the_browser() {
		   
			driver.close();
			driver.quit();
		}
		

            @Then("^User enters(.*) and (.*)$")
            public void user_enters(String uerid, String password) {
   
            	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(uerid);
        		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
            	
       }

		@Then("error message should displayed")
		public void error_message_should_displayed() {
		   
			String errormsg ;
			
		errormsg = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().toLowerCase();
			
		if(errormsg.contains("invalid")) {
			
			System.out.println("System displayes appropriate error message for invalid inputs.");
		}
		
		
		}	
		
		
}
