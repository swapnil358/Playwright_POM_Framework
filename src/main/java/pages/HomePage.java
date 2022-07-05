package pages;

import com.microsoft.playwright.Page;

public class HomePage {


    private final String search = "input[name='search']";

    //1. Maintain object repository using String locator
    private final String searchIcon = "div#search button";
    private final String searchPageHeader = "div #content h1";
    private Page page;


    //2. page constructor
    public HomePage(Page page) {
        this.page = page;
    }


    //3. page actions/methods
    public String getHomePageTitle() {
        return page.title();
    }

    public String getHomePageURL() {
        return page.url();
    }

    public String doSearch(String productName) {
        page.fill(search, productName);
        page.click(searchIcon);
        return page.textContent(searchPageHeader);

    }

}
