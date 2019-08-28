package co.uk.zoopla.hooks;

import co.uk.zoopla.helper.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass
{
	@Before
	public void setUp() throws Exception
	{
		launchBrowser("Chrome");
	}
	
	@After
	public void tearDown() throws Exception
	{
		closeBrowser();
	}
}
