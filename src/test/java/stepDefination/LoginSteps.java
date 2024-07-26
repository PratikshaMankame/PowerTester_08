package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps 
{
	WebDriver wd;
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() 
	{
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		System.out.println("Browser is opened");
		
		wd.get("https://www.saucedemo.com/v1/");
		System.out.println("Application is opened");
	}
	
	@When("User enters valid username {string}")
	public void user_enters_valid_username(String un) 
	{
		wd.findElement(By.id("user-name")).sendKeys(un);
	}

	@When("User enters valid password {string}")
	public void user_enters_valid_password(String pwd) 
	{
		wd.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() 
	{
		wd.findElement(By.id("login-button")).click();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() 
	{
	System.out.println("User logged in successfully");
	}
	
	@When("User enters invalid username {string}")
	public void user_enters_invalid_username(String invalid_un) 
	{
		wd.findElement(By.id("user-name")).sendKeys(invalid_un);
	}

	@Then("User should not login in application")
	public void user_should_not_login_in_application() 
	{
		System.out.println("Invalid credential");
	}
}