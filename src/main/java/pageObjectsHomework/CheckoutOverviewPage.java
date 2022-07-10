package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    public WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkoutOverviewPageTitleText = By.cssSelector("span[class='title']");
    private By inventoryItemName = By.xpath("//div[@class='inventory_item_name']");
    private By inventoryItemPrice = By.xpath("//div[@class='inventory_item_price']");
    private By finishButton = By.id("finish");

    public WebElement getCheckoutOverviewPageTitleText(){
        return driver.findElement(checkoutOverviewPageTitleText);
    }

    public WebElement getInventoryItemName(){
        return driver.findElement(inventoryItemName);
    }

    public WebElement getInventoryItemPrice(){
        return driver.findElement(inventoryItemPrice);
    }

    public WebElement getFinishButton(){
        return driver.findElement(finishButton);
    }

}


