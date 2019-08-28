package co.uk.zoopla.stepDefinitions;



import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	HomePage homepage = new HomePage();
	SearchResultPage searchResult = new SearchResultPage();
	
	@Given("I navigate to Zoopla homepage")
	public void i_navigate_to_Zoopla_homepage() throws Exception {
		homepage.navigateToHomepage();
	}

	@When("I enter a postcode")
	public void i_enter_a_postcode() {
	 
	}

	@When("I select a min price")
	public void i_select_a_min_price() {
	   
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
	public void i_click_on_Search_button() throws Exception {
	 searchResult = homepage.clickOnSearchButton();
	}

	@Then("the result of the search above is displayed")
	public void the_result_of_the_search_above_is_displayed() {
		
		
	}
	
	@Then("the search result for {string} is displayed")
	public void the_search_result_for_is_displayed(String search) throws Exception {
		searchResult.isCorrectResultDisplayed(search);
	}
	
	@When("I enter a region")
	public void i_enter_a_region() {
	    
	}
	
	@When("I enter a train station")
	public void i_enter_a_train_station() {
	    
	}
	
	@When("I enter my region as {string}")
	public void i_enter_my_region_as(String pCode) throws Exception {
		homepage.enterSearchFieldValue(pCode);
	}

	@When("I select my min price as {string}")
	public void i_select_my_min_price_as(String mnPrice) throws Exception {
		homepage.selectMinPrice(mnPrice);
		
	}

	@When("I select my max price as {string}")
	public void i_select_my_max_price_as(String mxPrice) {
		
	}

	@When("I select my property type as {string}")
	public void i_select_my_property_type_as(String property) {
	  
	}

	@When("I select number of bedrooms as {string}")
	public void i_select_number_of_bedrooms_as(String bed) {
	   
		
		
	}
	

	



	
}
