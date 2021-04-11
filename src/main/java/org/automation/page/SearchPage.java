package org.automation.page;

import org.apache.log4j.Logger;
import org.automation.main.MainPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.automation.variable.SearchPageVariable.*;
import static org.automation.variable.SearchPageVariable.url;

public class SearchPage extends MainPage {
    final static Logger logger = Logger.getLogger(String.valueOf(SearchPage.class));

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //search the computer
    public SearchPage  search() {
        hoverElement(search);
        clickElement(search);
        logger.info("Arama Kutusuna Tıklanıldı.");
        sendKeys(searchText,text);
        logger.info("Aranılanılacak Kelime : "+text);
        clickElement(searchBtn);
        logger.info("Arama Yapıldı Sonuçlar Gösteriliyor.");

        return this;
    }

    public SearchPage secondPage() {
        WebElement element = getDriver().findElement(pagination);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
        logger.info("2. arama sayfasına gidildi.");
        Assert.assertEquals(getDriver().getCurrentUrl(),url);
        logger.info("2.Sayfanın Açıldığı Kontrol Edildi.");

        return this;
    }

}