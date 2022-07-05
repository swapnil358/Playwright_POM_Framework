package tests;

import com.microsoft.playwright.Page;
import factory.PlaywrightFactory;
import org.testng.Assert;
import org.assertj.core.api.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest {

    HomePage homePage;
    PlaywrightFactory pf;
    Page page;

    @BeforeMethod
    public void setUp() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");
        homePage = new HomePage(page);
    }

    @Test
    public void homePageTitleTest() {
        String homePageTitle = homePage.getHomePageTitle();
        Assertions.assertThat(homePageTitle).isNotBlank().isEqualTo("Your Store");
    }


    @Test
    public void homePageURLTest(){
        String homePageURL = homePage.getHomePageURL();
        System.out.println("Home page url is :"+ homePageURL);
        Assertions.assertThat(homePageURL).isNotBlank().isEqualTo("https://naveenautomationlabs.com/opencart/");
    }

    @Test
    public void searchTest(){
        String actualSearchHeader = homePage.doSearch("Macbook");
        Assertions.assertThat(actualSearchHeader).isNotBlank().isEqualTo("Search - Macbook");

    }

    @AfterMethod
    public void tearDown() {
        pf.closeBrowser();
    }
}
