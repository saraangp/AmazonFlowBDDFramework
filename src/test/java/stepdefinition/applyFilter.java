package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class applyFilter {

	WebDriver driver;
	
	@Given("User is visits Amazone.in website")
	public void user_is_visits_amazone_in_website() {
	   driver.get("\"https://www.amazon.in/");
	}

	@When("User is search iphone on search box")
	public void user_is_search_iphone_on_search_box() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("User is click on filter and select dropdowns - Price low to high, High to low,Average customer review")
	public void user_is_click_on_filter_and_select_dropdowns_price_low_to_high_high_to_low_average_customer_review() {
		driver.findElement(By.xpath("//span[normalize-space()='Featured']")).click();
	}

	@Then("User should be successful apply filter")
	public void user_should_be_successful_apply_filter() {
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_1']")).click(); 
	}



	
}
