package com.stepdef;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.baseclass.ReusableMethod;
import com.helper.ConfigurationReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HookClass extends ReusableMethod {
	@Before("@login")
	public void bef() throws Exception {
		String B_Name = ConfigurationReader.getCrInstance().getFrInstance().getBrowserName();
		browserLaunch(B_Name);
		String URL = ConfigurationReader.getCrInstance().getFrInstance().getUrl();
		webSiteLaunch(URL);
		System.out.println("Browser & website Launch");
	}

	@BeforeStep
	public void befstep() {
		System.out.println("Before Step: " + driver.getTitle());
	}

	@AfterStep
	public void aftstep(Scenario s) throws IOException {
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(source, "image/png",s.getName());
			System.out.println("After Step: ScreenShot Taken");
		}	
	}

	@After("@searchproduct")
	public void aft() {
		driver.close();
		System.out.println("Browser Close");
	}
}
