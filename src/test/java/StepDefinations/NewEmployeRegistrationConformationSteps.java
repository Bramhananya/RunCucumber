package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewEmployeRegistrationConformationSteps {
	
	WebDriver driver ;
	
	String expempnumber ;
	
	@Given("user is on Google Page")
	public void user_is_on_google_page() {
		
		System.out.println(" Initially user is on google Page ");
	
	}
	@When("user enters OrangeHRM  real url")
	public void user_enters_orange_hrm_real_url() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	 
	    driver.get("http://orangehrm.qedgetech.com");
		
		Thread.sleep(3000);
	}


	@Then("user should navigated to the OrangeHRM home page")
	public void user_should_navigated_to_the_orange_hrm_home_page() {
	  
		String expectedlink;
	    expectedlink	= driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).getText().toLowerCase();
		
	    if(expectedlink.contains("LOGIN Panel")) {
	    	
	    	System.out.println("We are on the currect login page : Pass");
	    }
	
	}

	@Then("user enters real userid")
	public void user_enters_real_user_id() {
	   
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	}

	@And("user enters real password")
	public void user_enters_real_password() {
	   
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");
	}


         @Then("to press the submit button")
         public void to_press_the_submit_button() {
  
        	 driver.findElement(By.xpath("//input[@name='Submit']")).click();
      }
         
         
	@Then("user should naviigated to admin module main page")
	public void user_should_naviigated_to_admin_module_main_page() throws InterruptedException {
	   
		Thread.sleep(3000);
		
		String adminlink ;
		
		adminlink = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).getText().toLowerCase();
		
		System.out.println("Navigated to the adminmosule successfully...");
	}

	@Then("go to the PIM link")
	public void go_to_the_pim_link() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("PIM")).click();
	    
	}

	@Then("go to the add employe registration page")
	public void go_to_the_add_employe_registration_page() throws InterruptedException {
	    
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add Employee")).click();
	}
	
	@Then("enters firstname and middlename and lastname")
	public void enters_firstname_and_middlename_and_lastname() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='formInputText'])[1]")).sendKeys("Ankita");

		Thread.sleep(1000);
		
		driver.findElement(By.id("middleName")).sendKeys("Bramha");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastName")).sendKeys("Panchal");	
		
		Thread.sleep(2000);

	}


	@And("press the save button")
	public void press_the_save_button() throws InterruptedException {
		
	   Thread.sleep(2000);
	   
	  expempnumber =  driver.findElement(By.id("employeeId")).getAttribute("value");
	   
	   driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
	}
	@Then("i should see Employe registration successfully")
	public void i_should_see_employe_registration_successfully() throws InterruptedException {
	   
		Thread.sleep(3000);
		
		String actualempno = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		
		if(expempnumber == actualempno) {
			
			System.out.println("Pass : New Employe Regetrastion successfully ");
		}
		
	}

	@When("i click logout")
	public void i_click_logout() throws InterruptedException {
	   
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("i should navigated to the OrangeHRM Home Page")
	public void i_should_navigated_to_the_orange_hrm_home_page() {
	 
	  if(driver.findElement(By.xpath("//input[@name='openIdLogin']")).isDisplayed()) {
		  
		  System.out.println("we navigated successfully on HRM Home Page : Pass");
	  }else {
		  
		  System.out.println("Please correct the code : Fail ");
	  }
	  
	}
	
	 @Then("i close the browser")
	  public void i_close_the_browser() {
	      
		 driver.close();   
		 driver.quit();   
		 
		 System.out.println(" Pass: We have successfully closed this browser...");
	  }
		
	}	
	


