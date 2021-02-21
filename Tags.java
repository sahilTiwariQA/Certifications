package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tags {

	static WebDriver driver;
	static String url2="http://localhost:8080/EDUBank/tellerLogin";
	static String url1="http://localhost:8080/EDUBank/";
	@Given("^The Customer is on EDU customer Login Page$")
		public void the_Customer_is_on_EDU_customer_Login_Page() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		 //   throw new PendingException();
		
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url1);
		}

		@When("^Enters Login credentials$")
		public void enters_Login_credentials() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			driver.findElement(By.name("loginName")).sendKeys("Steven");
			driver.findElement(By.name("password")).sendKeys("Steven!123");
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/form/button")).click();
		}

		@Then("^Get title of the Page Displayed$")
		public void get_title_of_the_Page_Displayed() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new PendingException();
			System.out.println(driver.getTitle());
			driver.quit();
		}

		@Given("^EDU Bank Teller Home Page$")
		public void edu_Bank_Teller_Home_Page() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		 //   throw new PendingException();
			System.setProperty("webdriver.gecko.driver","/root/Desktop/SuppliedFiles/geckodriver");
	        driver = new FirefoxDriver();
	        driver.get(url2);
			
		}

		@When("^Enters login Details$")
		public void enters_login_Details() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		  //  throw new PendingException();
			driver.findElement(By.name("loginName")).sendKeys("T7302");
			driver.findElement(By.name("password")).sendKeys("T7302*abc");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
		}

		@Then("^Logged in$")
		public void logged_in() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new PendingException();
			System.out.println(driver.getTitle());
			driver.quit();
		}


}
