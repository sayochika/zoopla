package co.uk.zoopla.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.uk.zoopla.helper.BaseClass;

public class SearchResultPage extends BaseClass
{
	WebElement searchResultHeader;
	List<WebElement> searchResult;

	
	public void isCorrectResultDisplayed(String result) throws Exception
	{
		searchResultHeader = 
				getElementByCssSelector("[itemref=\"area_rating\"] h1");
		
		String resultText = searchResultHeader.getText();
		Assert.assertTrue(resultText.contains(result));
	}
	
}
