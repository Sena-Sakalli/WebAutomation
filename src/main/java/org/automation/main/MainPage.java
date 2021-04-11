package org.automation.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    public WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor executor;

    public MainPage(WebDriver driver)
    {
        this.driver=driver;
        wait=new WebDriverWait(this.driver,150);
        executor=(JavascriptExecutor) this.driver;
    }
    public WebElement findElement(By by)
    {

        return driver.findElement(by);
    }
    public void clickElement(By by)
    {

        findElement(by).click();
    }
    public void sendKeys(By by,String text)
    {
        findElement(by).sendKeys(text);
    }
    public void hoverElement(By by)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public WebDriver getDriver()
    {
        return driver;
    }

}






