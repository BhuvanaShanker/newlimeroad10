package com.Cucumber.NewLimeRoad;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Aravindan\\eclipse-workspace\\NewLimeRoad\\src\\test\\java\\NewLime_Features\\NewLimeRoad.feature",
glue = "com.Cucumber.New_stepDefin", plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Runner_NewLimeRoad {

}
