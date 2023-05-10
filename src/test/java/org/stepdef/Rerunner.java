package org.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resources/failed.txt", glue = "org.stepdef", plugin = "rerun:./src/test/failed.txt")
public class Rerunner {

}