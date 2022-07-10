package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InventoryPage {

    public WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitleText = By.cssSelector("span[class='title']");
    private By addBackpackToChartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By shoppingChartBadge = By.cssSelector("span[class='shopping_cart_badge']");
    private By addToChartButton = By.xpath("//a[@class='shopping_cart_link']");
    private By removeFromChartButton = By.id("remove-sauce-labs-backpack");



    public WebElement getPageTitleText(){
        return driver.findElement(pageTitleText);
    }

    public WebElement getAddBackpackToChartButton(){
        return driver.findElement(addBackpackToChartButton);
    }

    public WebElement getShoppingChartBadge(){
        return driver.findElement(shoppingChartBadge);
    }

    public WebElement getAddToChartButton(){
        return driver.findElement(addToChartButton);
    }

    public WebElement getRemoveFromChartButton(){
        return driver.findElement(removeFromChartButton);
    }

}
