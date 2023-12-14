package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class searchIphone {

	  WebDriver driver;
	@Before
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();		
	}	
	@After
	public void end() {
		
		driver.quit();
	}
	
	
	@Given("^User visits website Amazone.in$")
	public void user_visits_website_amazone_in() {
	    
		driver.get("https://www.amazone.in");		
	}

	@When("^User is  search the iphone on search box$")
	public void user_is_search_the_iphone_on_search_box() {
	   
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	}

	@When("^User click on search button$")
	public void user_click_on_search_button() {
	   
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("^Users should be visible the list of the products$")
	public void users_should_be_visible_the_list_of_the_products() {
	    
	}

	@Given("^Users visible the list of products$")
	public void users_visible_the_list_of_products() {
	    
		driver.findElement(By.xpath("//a[@class='a-link-normal _YXV0b_link_36_Co']")).isDisplayed();
	}

	@When("^User is  click on specific product which is want$")
	public void user_is_click_on_specific_product_which_is_want() {
		driver.findElement(By.linkText("iPhone 13 (128GB) - Blue")).click();
	}

	@Then("^User select the product$")
	public void user_select_the_product() {
		driver.findElement(By.linkText("iPhone 13 (128GB) - Blue")).click();
	}

	@Then("^User reach out on the product details page$")
	public void user_reach_out_on_the_product_details_page() {
	   
		Assert.assertTrue(driver.findElement(By.id("imgTagWrapperId")).isDisplayed());
	}

	@Then("^User able to see product details page$")
	public void user_able_to_see_product_details_page() {
	   
		driver.findElement(By.id("imgTagWrapperId")).isDisplayed();
	}

	@Given("^User should be visible specific product on the product details page$")
	public void user_should_be_visible_specific_product_on_the_product_details_page() {
	  
		driver.findElement(By.id("imgTagWrapperId")).isDisplayed();
	}

	@When("^User  click on Add to Cart$")
	public void user_click_on_add_to_cart() {
	   
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

	@Then("^User should be add the product on Add To Cart$")
	public void user_should_be_add_the_product_on_add_to_cart() {
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}



	
}
