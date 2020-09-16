package testCases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginTest {
	WebDriver driver;
	
	@Given("Able to navigate onto the login page")
	public void able_to_navigate_onto_the_login_page() {
		String chrome = "C:\\Users\\SaritaKumari\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("In enter the user name as {string}")
	public void in_enter_the_user_name_as(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);

	}
	@When("I Enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		

	}
	@When("I Enter the login button")
	public void i_enter_the_login_button() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(600);

	}
	
	@Then("I should log in as username {string}")
	public void i_should_log_in_as_username(String string) {
		String expected = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("Invalid Login",expected, string);
		driver.close();
	}

	@Then("I should see a error message as {string}")
	public void i_should_see_a_error_message_as(String string) {
		String getErrortext=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		Assert.assertEquals("Valid Login",getErrortext,"Invalid credentials");
	}







}
