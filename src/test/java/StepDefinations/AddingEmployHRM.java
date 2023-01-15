package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingEmployHRM {

	WebDriver driver;
	
	@Given("Initially user open the brower")
	public void initially_user_open_the_brower() {
	    
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.get("http://orangehrm.qedgetech.com");
	    
	    String Title =   driver.getTitle();
	   
	    System.out.println(Title);
	}

	@When("user enters the valid userid")
	public void user_enters_the_valid_userid() throws InterruptedException {
	   
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	}

	@And("user enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
	   
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");
	}

	@And("press the login button")
	public void press_the_login_button() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	
	@And("hits the PIM links")
	public void hits_the_pim_links() throws InterruptedException {
	   
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("PIM")).click();
	}

	@And("go to the Add Employe link")
	public void go_to_the_add_employe_link() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
	   
	}

	@Then("^add the (.*) and (.*) and (.*)$")
	public void add_the_bhimashankar_and_nilkant_and_bramhakar(String Firstname, String midlename , String lastname) throws InterruptedException {
	   
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@class='formInputText'])[1]")).sendKeys(Firstname);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("middleName")).sendKeys(midlename);
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys(lastname);	
		
		Thread.sleep(2000);
		
	}
		
		@Then("hits the save button")
		public void hits_the_save_button() {
			
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			
			System.out.println(" Employee added successfully...Pass");
		}

		@Then("i should see the new employe added sucessfully")
		public void i_should_see_the_new_employe_added_sucessfully() {
		  
		}

		@When("i cllose browser")
		public void i_cllose_browser() {
		    
			driver.close();
			driver.quit();
		}

	}
	

		
		
	