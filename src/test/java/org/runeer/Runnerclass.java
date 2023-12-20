package org.runeer;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.steps",monochrome = true,dryRun = false,tags="@mastro",plugin = { "html:src\\test\\resources\\Reports",
				"junit:src\\test\\resources\\Reports\\bobs.xml", "json:src\\test\\resources\\Reports\\output.json",
				"rerun:src\\\\test\\\\resources\\\\Reports\\mohan.txt" })


public class Runnerclass {

	@AfterClass
	public static void reportGe() {

		JvmReport.GeneratJvmreport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\output.json");

	}

}
