package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage {

    public WebDriver driver;

    public ChartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By chartPageTitleText = By.cssSelector("span[class='title']");
    private By removeBackpackFromChartButton = By.id("remove-sauce-labs-backpack");
    private By inventoryItemPrice = By.xpath("//div[@class='inventory_item_price']");
    private By checkoutButton = By.id("checkout");



    public WebElement getChartPageTitleText(){
        return driver.findElement(chartPageTitleText);
    }


    public WebElement getRemoveBackpackFromChartButton(){
        return driver.findElement(removeBackpackFromChartButton);
    }

    public WebElement getInventoryItemPrice(){
        return driver.findElement(inventoryItemPrice);
    }

    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
}
