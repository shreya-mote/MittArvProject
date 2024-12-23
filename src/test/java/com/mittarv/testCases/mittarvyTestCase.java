package com.mittarv.testCases;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class mittarvyTestCase {
	@Description("Verify the login functionality")
    @Test
    public void loginTest() {
        step1();
        step2();
    }

    @Step("Step 1: Open the login page")
    public void step1() {
        System.out.println("Opening login page...");
    }

    @Step("Step 2: Enter credentials and login")
    public void step2() {
        System.out.println("Entering credentials...");
    }
}
