package com.test.bearSoftware.tests;

import com.test.bearSoftware.TestBase;
import com.test.bearSoftware.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTesting() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(1500);
        loginPage.sendInfoLogin("Tester", "test");
    }
}
