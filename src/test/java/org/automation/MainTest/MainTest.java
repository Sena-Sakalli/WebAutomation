package org.automation.MainTest;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monster-PC\\IdeaProjects\\WebAutomation\\Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        setDriver(new ChromeDriver(options));
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        getDriver().navigate().to("https://www.gittigidiyor.com");
    }

    @After
    public void tearDown()
    {
        getDriver().quit();
    }
    public WebDriver getDriver()
    {
        return driver;
    }
    public void setDriver(WebDriver driver)
    {
        this.driver=driver;
    }
}


