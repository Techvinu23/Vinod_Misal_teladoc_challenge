package StepDefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BasePck.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	WebDriver driver= new ChromeDriver();
    BasePage  basepage= new BasePage(driver);
    
    @Before
    public void browserSetup() {
    	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
    	driver.close();
    	driver.quit();
    }
   
	@Given("Launch web application")
	public void launch_web_application() {
		
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
	}

	@When("User click on add user button")
	public void user_click_on_add_user_button() {
		// Write code here that turns the phrase above into concrete actions
		basepage.addUser("Testvr", "testvm", "VRM", "12345", "testvr@gk.com");

	}

	@Then("User should added in table")
	public void user_should_added_in_table() {
		Assert.assertTrue(basepage.isUserExist("VRM"));
	}
	
	
	@When("User click on delete user button")
	public void user_click_on_delete_user_button() {
		
	    basepage.deleteUser("novak");
	   
	}

	@Then("User should deleted from table")
	public void user_should_deleted_from_table() {
	    // Write code here that turns the phrase above into concrete actions
	    basepage.isUserExist("novak");
	    
	    Assert.assertFalse(basepage.isUserExist("novak"));
	}
	
	
	

}

