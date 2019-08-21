package co.uk.zoopla.stepDefinitions;



import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSteps {
	
	WebDriver driver;
	WebElement searchField;
	WebElement minPrice;
	WebElement searchButton;
	WebElement maxPrice;
	WebElement propertyType;
	WebElement bedroom;
	WebElement searchResultHeader;
	List<WebElement> searchResult;
	
	@Given("I navigate to Zoopla homepage")
	public void i_navigate_to_Zoopla_homepage() {
	 	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.zoopla.co.uk/");
		
	}

	@When("I enter a postcode")
	public void i_enter_a_postcode() {
	  searchField = 
	 driver.findElement(By.id("search-input-location")); 
	  searchField.sendKeys("OL9 8LE");
	}

	@When("I select a min price")
	public void i_select_a_min_price() {
	   minPrice = driver
			   .findElement(By.id("forsale_price_min"));
	   Select select = new Select(minPrice);
	   Random ran = new Random();
	   int randomNum = ran.nextInt(10);
	   //select.selectByVisibleText("£125,000");
	   //select.selectByValue("125000");
	   select.selectByIndex(randomNum);
	}

	@When("I select a max price")
	public void i_select_a_max_price() {
	   
		
		
	}

	@When("I select a property type")
	public void i_select_a_property_type() {
	    
	}

	@When("I select number of bedrooms")
	public void i_select_number_of_bedrooms() {
	    
	}

	@When("I click on Search button")
	public void i_click_on_Search_button() {
	  searchButton = driver.
			  findElement(By.id("search-submit")) ;
	  searchButton.click();
	  //searchButton.sendKeys(Keys.ENTER);
	  //searchButton.isEnabled();
	}

	@Then("the result of the search above is displayed")
	public void the_result_of_the_search_above_is_displayed() {
		
		searchResultHeader = driver.findElement(By.tagName("h1"));
		String headerText = searchResultHeader.getText();
		
	    Assert.assertTrue(headerText.contains("Manchester"));
	}
	
	@Then("the search result for {string} is displayed")
	public void the_search_result_for_is_displayed(String search) {
		searchResultHeader = driver.findElement(By.tagName("h1"));
		String headerText = searchResultHeader.getText();
		
	    Assert.assertTrue(headerText.contains(search));
	}
	
	@When("I enter a region")
	public void i_enter_a_region() {
	    
	}
	
	@When("I enter a train station")
	public void i_enter_a_train_station() {
	    
	}
	
	@When("I enter my region as {string}")
	public void i_enter_my_region_as(String pCode) {
		searchField = 
				 driver.findElement(By.id("search-input-location")); 
				  searchField.sendKeys(pCode); 
				  searchField.click();
	}

	@When("I select my min price as {string}")
	public void i_select_my_min_price_as(String mnPrice) {
		minPrice = driver
				   .findElement(By.id("forsale_price_min"));
		   Select select = new Select(minPrice);
		   select.selectByVisibleText(mnPrice);
		
	}

	@When("I select my max price as {string}")
	public void i_select_my_max_price_as(String mxPrice) {
		maxPrice = driver.findElement(By.id("forsale_price_max"));
		
		Select select = new Select(maxPrice);
		select.selectByVisibleText(mxPrice);
	}

	@When("I select my property type as {string}")
	public void i_select_my_property_type_as(String property) {
	    propertyType = driver.findElement(By.id("property_type"));
	    
	    Select select = new Select(propertyType);
	    select.selectByVisibleText(property);
	}

	@When("I select number of bedrooms as {string}")
	public void i_select_number_of_bedrooms_as(String bed) {
	   
		bedroom = driver.findElement(By.id("beds_min"));
		Select select = new Select(bedroom);
		select.selectByVisibleText(bed);
		
	}
	

	



	
}
