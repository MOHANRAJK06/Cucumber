package org.runeer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Reports\\mohan.txt",glue="org.steps", dryRun =false,tags= {"@sanity"},plugin= {"pretty","html:src\\test\\resources\\Reports",
		 "junit:src\\test\\resources\\Reports\\bobs.xml",
		"json:src\\test\\resources\\Reports\\output.json",
		 "rerun:src\\\\test\\\\resources\\\\Reports\\mohan.txt"})

public class RunnerClassRerun {
	
	
	
	

}
