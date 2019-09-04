package co.uk.zoopla.hooks;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import co.uk.zoopla.helper.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass
{
	public Scenario scenario;
	
	@Before
	public void setUp(Scenario scenario) throws Exception
	{
		this.scenario = scenario;
		
		launchBrowser("Chrome");
	}
	
	@After
	public void tearDown() throws Exception
	{
		
		String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("HHmmss").format(new GregorianCalendar().getTime());
		
		String fileName = String.format("./Screenshots/%s/screenshot_%s.html", dateNow, timeNow);

		
		if(scenario.isFailed())
		{
			try {
				byte[] screeshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screeshot, fileName);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		closeBrowser();
	}
}
