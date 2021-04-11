package org.automation.page;

import org.apache.log4j.Logger;
import org.automation.main.MainPage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.automation.variable.BasketPageVariable.*;

public class BasketPage extends MainPage {

    final static Logger logger = Logger.getLogger(String.valueOf(BasketPage.class));

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage basketSelect(){
        Random random = new Random();
        int index =random.nextInt(48)+1;
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçiliyor.");
        List<WebElement> products = getDriver().findElements(ProductList);
        products.get(index).click();
        logger.info("Açılan Ürünlerden Rastgele Bir Ürün Seçildi.");

        return this;
    }

    public BasketPage addBasket()  {
        productPrice = getDriver().findElement(ProductPrice).getText();
        logger.info("Seçilen Ürünün Fiyatı :" +productPrice);
        logger.info("Sepete Ekle'ye Tıklandı.");

        WebElement element = getDriver().findElement(AddBasket);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        logger.info("Sepete eklendi.");

        return this;
    }

    public BasketPage comparison() {
        productPrice = driver.findElement(ProductPrice).getText();

        WebElement element = getDriver().findElement(GoToBasket);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        basketPrice = getDriver().findElement(BasketPrice).getText();
        logger.info("Sepetteki Ürünün Fiyatı :" + basketPrice);
        Assert.assertEquals(productPrice,basketPrice);
        logger.info("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırıldı.");

        return this;
    }

    public BasketPage increasingTheNumberOfProduct() {
        findElement(NumberOfProduct).click();
        findElement(NumberOfProductValue).click();
        Assert.assertEquals("Ürün Toplamı (2 Adet)",NumberOfProductValue);
        logger.info("ürün sayısı artırıldı ve 2 adet olduğu kontrol edildi.");

        return this;
    }

    public BasketPage deleteProduct() {
        findElement(DeleteButton).click();
        message=findElement(EmptyBasket).getText();
        Assert.assertEquals(emptyMessage,message);
        logger.info("Sepet boşaltıldı ve test tamamlandı.");
        driver.quit();

        return this;
    }

}