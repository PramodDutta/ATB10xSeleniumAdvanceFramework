package com.thetestingacademy.tests.pom.orangeHRM;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.pages.pageObjectModel.orangeHRM.EmployeeListHomePage;
import com.thetestingacademy.pages.pageObjectModel.orangeHRM.LoginPageOrangeHRM_POM;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.Assert;


import static com.thetestingacademy.driver.DriverManager.getDriver;

public class TestOrangeHR_POM  extends CommonToAllTest {

    @Owner("PRAMOD")
    @Description("Verify that the login to the OrangeHR ")
    @Test
    public void testLoginPositive() {


        LoginPageOrangeHRM_POM loginHRPage = new LoginPageOrangeHRM_POM(getDriver());
        loginHRPage.loginToHRCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));

        EmployeeListHomePage dashboardPagePom = new EmployeeListHomePage(getDriver());
        String loggedInUserName = dashboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName,PropertiesReader.readKey("ohr_expected_username"));


    }
}
