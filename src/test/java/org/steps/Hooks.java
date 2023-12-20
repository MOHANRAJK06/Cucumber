package org.steps;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;

import cucumber.api.java.bs.A;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mypac.Baseclass;

public class Hooks extends Baseclass{
	


	@Before
	public void start() {
		System.out.println("Mohan");

		 EdgeLaunch();
		 loadUrl("https://www.bobsredmill.com/");
	     wMaximaize();
	     priTittle();

	}
	
	@After
	public void End (Scenario s) throws IOException   {
			
		
		if (s.isFailed()) {
			
			TakesScreenshot Tk = (TakesScreenshot)driver;
			
			byte[] foramt = Tk.getScreenshotAs(OutputType.BYTES);
			s.embed(foramt, "image/png");
			
			
		}
		else {
	    String Ref = s.getName();
		
		sCreenShot(Ref);
			
			sClose();
			System.out.println("Raj");

	}
	
	
	}
}


