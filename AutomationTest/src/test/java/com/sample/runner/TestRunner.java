package com.sample.runner;


import cucumber.api.CucumberOptions;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ExecutionReport/report.html"},
        glue = {"com.sample.stepDefinition"},
		tags = {"@Example"}
    )

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/config/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Window");
        Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
