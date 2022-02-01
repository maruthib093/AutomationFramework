package com.extend.test;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test(groups = {"login"})
    public void loginTest(){
        ExtentTest loginTest = extent.createTest("LoginTest", "Test for login What We Do: Operate Multi-Cloud Architecture" +
                "We help you simplify cloud complexity with an open, software-defined hybrid multicloud platform, so that you can focus on business outcomes and new innovations.");
        loginTest.assignCategory("login").createNode("Desc","Test for login What We Do: Operate Multi-Cloud Architecture" +
                "We help you simplify cloud complexity with an open, software-defined hybrid multicloud platform, so that you can focus on business outcomes and new innovations.");

        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        AssertionError login_failed = new AssertionError("Login failed");
        loginTest.fail(login_failed);
        extent.flush();
        throw login_failed;
    }

    @Test(groups = {"signup"})
    public void signinTest(){
        ExtentTest loginTest = extent.createTest("SignInTest");
        loginTest.assignCategory("signin");
        loginTest.info("step1");
        loginTest.info("step2");
        loginTest.info("step3");
        loginTest.info("step4");
        loginTest.pass("step5");
        extent.flush();
    }


}
