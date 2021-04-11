package org.automation.page;

import org.junit.Assert;
import org.automation.main.MainPage;
import org.openqa.selenium.WebDriver;

import org.apache.log4j.Logger;

import static org.automation.variable.LoginPageVariable.*;

public class LoginPage extends MainPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    final static Logger logger = Logger.getLogger(String.valueOf(LoginPage.class));


    public void Login() {
        logger.info("Test Edilecek Site Açıldı.");
        Assert.assertEquals(homeTitle, getDriver().getTitle());
        logger.info("Ana Sayfanın Açıldığı Kontrol Edildi. ");
        hoverElement(LogIn);
        clickElement(Logg);
        logger.info("Login Sayfası Açıldı.");
        Assert.assertEquals(loginTitle, getDriver().getTitle());
        logger.info("Açılan Sayfanın Login Sayfası Olduğu Kontrol Edildi.");
        findElement(UserName).clear();
        sendKeys(UserName, userName);
        findElement(Password).clear();
        sendKeys(Password, password);
        clickElement(LogInButton);
        logger.info("Login İşlemi Gerçekleşti.");
        Assert.assertEquals(homeTitle, getDriver().getTitle());
        logger.info("Ana Sayfaya Yönlendirilme Kontrol Edildi.");
    }
}