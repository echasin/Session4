package com.innvo.cucumber.stepdefs;

import com.innvo.Session4App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Session4App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
