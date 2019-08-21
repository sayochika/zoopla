package co.uk.zoopla.pages;

import org.openqa.selenium.WebElement;

import co.uk.zoopla.helper.BaseClass;

public class HomePage extends BaseClass
{

	
	WebElement searchField;
	WebElement minPrice;
	WebElement searchButton;
	WebElement maxPrice;
	WebElement propertyType;
	WebElement bedroom;
	
	public void navigateToHomepage() throws Exception
	{
		launchUrl("https://www.zoopla.co.uk/");
	}
	
	public void enterSearchFieldValue(String region) throws Exception
	{
		searchField = 
			getElementByCssSelector("#search-input-location");
		
		searchField.sendKeys(region);
		
	}
	
	public void selectMinPrice(String minimumPrice) throws Exception
	{
		Thread.sleep(5000);
		minPrice = getElementById("forsale_price_min");
		selectByText(minPrice, minimumPrice);
	}
	
	public SearchResultPage clickOnSearchButton() throws Exception
	{
		searchButton = getElementByCssSelector("#search-submit");
		
		searchButton.click();
		
		return new SearchResultPage();
	}
	
	
}
