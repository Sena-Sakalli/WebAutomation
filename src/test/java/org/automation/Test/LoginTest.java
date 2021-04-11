package org.automation.Test;
import org.automation.MainTest.MainTest;
import org.automation.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends MainTest {
    LoginPage loginPage;

    @Before
    public void beforeTest() {

        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void LoginTest() {

        loginPage.Login();
    }

    @After
    public void afterTest() {
        getDriver().quit();
    }
}
