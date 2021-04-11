package org.automation.variable;

import org.openqa.selenium.By;

public class SearchPageVariable {
    public static String text = "bilgisayar";
    public static String url = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";

    public static final By search = By.cssSelector("form>div>div[class='sc-1yew439-3 dkiUfE']");
    public static final By searchText = By.name("k");
    public static final By searchBtn = By.cssSelector("div>button[data-cy='search-find-button']");
    public static final By pagination = By.cssSelector("div.pager>ul>li:nth-of-type(2)>a");
}
