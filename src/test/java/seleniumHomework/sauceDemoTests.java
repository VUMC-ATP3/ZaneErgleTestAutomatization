package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.Footer;
import pageObjects.LoginPage;
import pageObjectsHomework.*;

public class sauceDemoTests {

    WebDriver driver;

    private final String SOUCEDEMO_URL= "https://www.saucedemo.com/";

    @BeforeMethod
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void scenario1() throws InterruptedException {
        driver.get(SOUCEDEMO_URL);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitleText().getText(),"PRODUCTS");
        Assert.assertEquals(inventoryPage.getAddBackpackToChartButton().getText(), "ADD TO CART");
        inventoryPage.getAddBackpackToChartButton().click();
        Assert.assertEquals(inventoryPage.getRemoveFromChartButton().getText(), "REMOVE");
        Assert.assertEquals(inventoryPage.getShoppingChartBadge().getText(), "1");
        inventoryPage.getAddToChartButton().click();

        ChartPage chartPage = new ChartPage(driver);
        Assert.assertEquals(chartPage.getChartPageTitleText().getText(), "YOUR CART");
        Assert.assertEquals(chartPage.getInventoryItemPrice().getText(), "$29.99");
        chartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(checkoutPage.getCheckoutPageTitleText().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.checkout("Zane", "Ergle", "LV3401");
        checkoutPage.getCheckoutButton().click();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertEquals(checkoutOverviewPage.getCheckoutOverviewPageTitleText().getText(), "CHECKOUT: OVERVIEW");
        Assert.assertEquals(checkoutOverviewPage.getInventoryItemName().getText(), "Sauce Labs Backpack");
        Assert.assertEquals(checkoutOverviewPage.getInventoryItemPrice().getText(), "$29.99");
        checkoutOverviewPage.getFinishButton().click();
        Assert.assertEquals(checkoutOverviewPage.getCheckoutOverviewPageTitleText().getText(), "CHECKOUT: COMPLETE!");

        CheckoutSuccessPage checkoutSuccessPage = new CheckoutSuccessPage(driver);
        Assert.assertEquals(checkoutSuccessPage.getCompleteHeader().getText(), "THANK YOU FOR YOUR ORDER");
        checkoutSuccessPage.getBackHomeButton().click();
        Assert.assertEquals(inventoryPage.getPageTitleText().getText(),"PRODUCTS");
        System.out.println("You have successfully navigated back to " + inventoryPage.getPageTitleText().getText() + " page");
    }

    @AfterMethod
    public void closingBrowser(){
        driver.quit();
    }
}
