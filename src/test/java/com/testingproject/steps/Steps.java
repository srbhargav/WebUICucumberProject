package com.testingproject.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testingproject.pages.LoginPage;
import com.testingprojects.base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;


/*A Step Definition is a small piece of code with a pattern attached to it or in other words
a Step Definition is a java method in a class with an annotation above it.*/

public class Steps {

	public WebDriver driver;
	LoginPage loginpage;

	
	//Using before hook, gets executed well before any other test scenario
	//setUp() method to set up initial state for all test methods 
	@Before()
	public void setup() {

		//opening the browser instance
		driver = DriverFactory.get_driver_instance();
		loginpage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	//opening the url in the browser
	@Given("I am on the herokuapp welcome page")
	public void i_am_on_the_herokuapp_welcome_page() {

		driver.get("http://the-internet.herokuapp.com/");
	}

	
	@Given("click on Form Authentication link")
	public void click_on_Form_Authentication_link() {

		loginpage.ClickLink();

	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_credentials(String username, String password) {

		loginpage.enter_username(username);
		loginpage.enter_password(password);
		loginpage.ClickLogin();

	}

	@Then("I should be taken to the secure area page")
	public void i_should_be_taken_to_the_secure_area_page() {

		Assert.assertEquals("Secure Area",
				driver.findElement(By.xpath("//h2[normalize-space()='Secure Area']")).isDisplayed(), true);
		loginpage.ClickLogOut();

	}

	//After hook, gets executed after executing the scenario.
	//tearDown() method perform cleanup after execution.
	@After()
	public void teardown() {
		driver.quit();
	}

}
