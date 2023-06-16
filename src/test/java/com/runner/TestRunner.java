package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
//@CucumberOptions(features="features",glue="com.stepdef",dryRun=false,plugin={"pretty","json:target/cucumber.json"})
//@CucumberOptions(features="features",glue="com.stepdef",dryRun=false,plugin={"pretty","html:target/cucumber2.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
@CucumberOptions(features="features",glue="com.stepdef",dryRun=false,plugin={"pretty","html:target/cucumber2.html"})
public class TestRunner {

}
