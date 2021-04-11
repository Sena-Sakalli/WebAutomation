package org.automation.Test;
import org.automation.MainTest.MainTest;
import org.automation.page.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class SearchTest extends MainTest {

    SearchPage searchPage;

    @Before
    public void beforeTest() {
        searchPage = new SearchPage(getDriver());
        getDriver().navigate().to("https://www.gittigidiyor.com");
    }

    @Test
    public void SearchTest() {
        searchPage.search().secondPage();

    }

    @After
    public void afterTest() {
        getDriver().quit();
    }

}


