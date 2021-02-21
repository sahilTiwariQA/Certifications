package demosHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks {
	
	static WebDriver driver;
	
	static String url="http://localhost:8080/EDUBank/tellerLogin";
	@Before
	public void beforescenario()
	{
	
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
	    driver = new FirefoxDriver();
	    driver.get(url);
		driver.findElement(By.name("loginName")).sendKeys("T7302");
		driver.findElement(By.name("password")).sendKeys("T7302*abc");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
	}
	
		@When("^Enters the details of New Account$")
		public void enters_the_details_of_New_Account() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
	
			driver.findElement(By.name("custName")).sendKeys("DON");
			driver.findElement(By.name("email")).sendKeys("Don@Gmail.com");
			driver.findElement(By.name("dob")).sendKeys("12/12/1985");
			Select q=new Select (driver.findElement(By.name("secQId")));
			q.selectByVisibleText("What was the name of your first pet?");
			driver.findElement(By.name("secAns")).sendKeys("Rocky");
			
		}

		@Then("^Creates the Account$")
		public void creates_the_Account() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/form/button[1]")).click();
		}

		@When("^Searches for an Account$")
		public void searches_for_an_Account() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a/span")).click();
			driver.findElement(By.name("accountNumber")).sendKeys("318269");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/form/button")).click();
		}

		@Then("^Displays The Details$")
		public void displays_The_Details() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		
			System.out.println(driver.getTitle());
		}
		@After()
		public void afterscenario()
		{
			driver.quit();
		}



}
