package demos;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterization {
	static WebDriver driver;
	static String url="http://localhost:8080/PackAndGo_v2/";
	
	@Given("^user is on PackAndGo login page$")
	public void user_is_on_PackAndGo_login_page() throws Exception {
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url);
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		
	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void user_enters_the_and_credentials(String username, String password) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
		WebElement form=driver.findElement(By.xpath("//*[@id=\"loginForm\"]"));
		form.findElement(By.id("usernameLogin")).sendKeys(username);
		form.findElement(By.name("passwordL")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='login']")).click();
		//driver.quit();
	}

	@Then("^user logged in and checks for Edit Profile$")
	public void user_logged_in_and_checks_for_Edit_Profile() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.xpath("//*[@id=\"sideMenu3\"]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"editAccount\"]")).click();
		
	}

	@Then("^user logout from application$")
	public void user_logout_from_application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.findElement(By.xpath("//*[@id=\"topMenu2\"]/a")).click();
		driver.quit();
	}



}
