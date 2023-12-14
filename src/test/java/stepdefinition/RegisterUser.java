package stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUser {

	WebDriver driver;
	
	@When("User  click on Sign In button")
	public void user_click_on_sign_in_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@When("User reach out on signIn page")
	public void user_reach_out_on_sign_in_page() {
	    driver.findElement(By.xpath("//div[@class='a-box']")).isDisplayed();
	}

	@When("User Create your Amazon Account")
	public void user_create_your_amazon_account() {
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();	
	}

	@When("User is enters fullname {string} phone no {string} Email \"sarangpawar146@gmail.com\"password {string}")
	public void user_is_enters_fullname_phone_no_email_sarangpawar146_gmail_com_password(DataTable datatable) {
	  Map<String, String> datamap = datatable.asMap(String.class,String.class);
	  driver.findElement(By.id("ap_customer_name")).sendKeys(datamap.get("fullname"));
	  
	}

	@When("User is click on verify mobile number")
	public void user_is_click_on_verify_mobile_number(DataTable datatables) {
	  Map<String, String> datamap2 = datatables.asMap(String.class,String.class);
	  driver.findElement(By.id("ap_phone_number")).sendKeys(datamap2.get("phone No"));
	}

	@When("^User is click on Email address$")
	 public void User_is_click_on_Email_address(DataTable datatables1) {
	Map<String, String> datamap3 = datatables1.asMap(String.class,String.class);	
	driver.findElement(By.id("ap_email")).sendKeys(datamap3.get("Email"));
	}
	@When("^user is click on Password$")
	public void user_is_click_on_Password(DataTable datatable2) {
		Map<String, String> datamap4 = datatable2.asMap(String.class,String.class);	
		driver.findElement(By.id("ap_password")).sendKeys(datamap4.get("Password"));
	}
	@Then("User should be created account")
	public void user_should_be_created_account() {
		driver.findElement(By.id("continue")).click();
	}



	
	
	
}
