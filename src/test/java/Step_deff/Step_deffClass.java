package Step_deff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step_deffClass {
static WebDriver driver;
String URL ="https://www.amazon.com";
@Given("^Launch application URL$")
public void launch_application_URL() throws Throwable {
	
WebDriver driver;
String URL ="^https:www.amazon.com";
	  System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe" );
	  
	  driver = new ChromeDriver();
	  
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
}

@Then("^click on customer service link$")
public void click_on_customer_service_link() throws Throwable {
   WebElement customer = driver.findElement(By.linkText("Customer Service"));
	customer.click();
	
}

@Then("^verify customer service link page available$")
public void verify_customer_service_link_page_available() throws Throwable {
	 boolean result = driver.findElement(By.linkText("Home")).isDisplayed();
	 Assert.assertTrue(result);
   
   
}


	
	
}
