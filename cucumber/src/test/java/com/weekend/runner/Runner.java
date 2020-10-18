package com.weekend.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
glue = {"com.weekend.stepdefinitions"},
tags = "@tagmultiple")

public class Runner {

}