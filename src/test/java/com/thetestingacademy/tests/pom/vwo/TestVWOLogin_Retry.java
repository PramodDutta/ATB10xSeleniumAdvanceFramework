package com.thetestingacademy.tests.pom.vwo;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.listeners.RetryAnalyzer;
import com.thetestingacademy.listeners.ScreenshotListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;

import static com.thetestingacademy.driver.DriverManager.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_Retry extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_Retry.class);

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(false);
    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }








    }
