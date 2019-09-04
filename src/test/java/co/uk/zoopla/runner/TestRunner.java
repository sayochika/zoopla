package co.uk.zoopla.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/co/uk/zoopla/features"},
		plugin = {"pretty", "json:target/report.json", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		glue = {"co.uk.zoopla.hooks", "co.uk.zoopla.stepDefinitions"},
		tags = {"~@ignore"}
		)

public class TestRunner {

}
