package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Login"),
dryRun=false,
monochrome=true, stepNotifications=true,snippets=SnippetType.CAMELCASE,
plugin= {"pretty",
"json:target\\login2.json","rerun:target\\rerun2.txt"},features= {"C:\\Users\\User\\eclipse-workspace\\DataFromExcellForAdactin\\src\\test\\resources"},
glue= {"com.stepdefinition"})

public class TestRunnerClass {


	
}
