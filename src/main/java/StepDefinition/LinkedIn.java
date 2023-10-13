package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedIn {
	
	@Given("^User is already on Login page$")
	public void user_is_already_on_Login_page()  {
		
		
		 
		
		
//		System.setProperty("webdriver.chrome.driver","D:\\Minakshi\\Selenium\\Drivers\\chromedriver"); 
//		 WebDriver driver=new ChromeDriver(); 
//		 driver.get("http://www.gmail.com");
//		 
		 
		
		System.out.println("Hi");
		
		System.out.println("hello");
}

	@When("^The tile of the page is LinkedIn$")
	public void the_tile_of_the_page_is_LinkedIn(){
		System.out.println("Title");
	}

	@Then("^Enter Email and Password$")
	public void enter_Email_and_Password() {
		System.out.println("Enter Email and password");
	}

	@Then("^Click Sign in button$")
	public void click_Sign_in_button() {
		System.out.println("Click Sign");
	}

	
	
}
