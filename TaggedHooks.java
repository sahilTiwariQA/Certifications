package demos;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TaggedHooks {
	static WebDriver driver;
	static String url="http://localhost:8080/PackAndGo_v2/";
	
@Before("@Login ")
public void beforelogin()
{	
	System.out.println("Customer is Login ");
}
@Before("@SignUP ")
public void beforeSignUp()
{
	System.out.println("Customer is Registering in Pack and Go ");
	
	}

	@Given("^Customer is in Giving Login Credentials$")
	public void customer_is_in_Giving_Login_Credentials() throws Exception {
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
		WebElement form=driver.findElement(By.xpath("//*[@id=\"loginForm\"]"));
		form.findElement(By.id("usernameLogin")).sendKeys("pgAlmacho");
		form.findElement(By.name("passwordL")).sendKeys("freezeray");
		driver.findElement(By.xpath("//*[@id='login']")).click();
	}

	@Then("^Customer is Logged in$")
	public void customer_is_Logged_in() throws Exception {
	  	System.out.println("Customer Logged In ");
	  	driver.quit();
		
	}

	@Given("^Customer Fills the Sign In details$")
	public void customer_Fills_the_Sign_In_details() throws Exception {
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
		driver.findElement(By.id("usernameSignUp")).sendKeys("Don");
		driver.findElement(By.id("emailSignUp")).sendKeys("Don@Gmail.com");
		driver.findElement(By.id("passwordSignUp")).sendKeys("don1234");
		driver.findElement(By.id("signUp")).click();
		
	}

	@Then("^Customer Registerd in Pack and Go$")
	public void customer_Registerd_in_Pack_and_Go() throws Exception {
	    
		System.out.println("Customer Registered");
	  	driver.quit();

	}

	

}
