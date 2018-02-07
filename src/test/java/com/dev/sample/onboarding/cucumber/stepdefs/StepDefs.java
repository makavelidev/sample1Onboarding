package com.dev.sample.onboarding.cucumber.stepdefs;

import com.dev.sample.onboarding.Sample1OnboardingApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Sample1OnboardingApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
