package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(features = ".", tags = "@referAProductToFriend" , plugin = {"pretty", "html:target/cucumber-html-report.html"})
    class RunCuke {


    }