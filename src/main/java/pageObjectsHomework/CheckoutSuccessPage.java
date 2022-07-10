package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {

    public WebDriver driver;

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkoutSuccessPageTitleText = By.cssSelector("span[class='title']");
    private By completeHeader = By.xpath("//h2[@class='complete-header']");
    private By backHomeButton = By.id("back-to-products");

    public WebElement getCheckoutSuccessPageTitleText(){
        return driver.findElement(checkoutSuccessPageTitleText);
    }

    public WebElement getCompleteHeader(){
        return driver.findElement(completeHeader);
    }

    public WebElement getBackHomeButton(){
        return driver.findElement(backHomeButton);
    }
}
