package org.automation.Test;

import org.automation.MainTest.MainTest;
import org.automation.page.BasketPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BasketTest extends MainTest {
    BasketPage basketPage;

    @Before
    public void beforeTest()
    {
        basketPage =new BasketPage(getDriver());

    }

    @Test
    public void BasketTest()
    {
        basketPage.basketSelect().addBasket().comparison().
                increasingTheNumberOfProduct().deleteProduct();

    }

    @After
    public void afterTest()
    {
        getDriver().quit();
    }
}


