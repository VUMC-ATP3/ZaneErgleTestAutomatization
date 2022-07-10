package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    public WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkoutPageTitleText = By.cssSelector("span[class='title']");
    private By nameInputField = By.id("first-name");
    private By lastNameInputField = By.id("last-name");
    private By postalCodeInputField = By.id("postal-code");
    private By checkoutButton = By.id("continue");

    public void checkout(String name, String lastName, String zipcode){
        getNameInputField().sendKeys(name);
        getLastNameInputField().sendKeys(lastName);
        getPostalCodeInputField().sendKeys(zipcode);
    }

    public WebElement getCheckoutPageTitleText(){
        return driver.findElement(checkoutPageTitleText);
    }

    public WebElement getNameInputField(){
        return driver.findElement(nameInputField);
    }

    public WebElement getLastNameInputField(){
        return driver.findElement(lastNameInputField);
    }

    public WebElement getPostalCodeInputField(){
        return driver.findElement(postalCodeInputField);
    }

    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
}


//        WebElement nameInputField = driver.findElement(By.id("first-name"));
//        nameInputField.sendKeys("Zane");
//        WebElement lastNameInputField = driver.findElement(By.id("last-name"));
//        lastNameInputField.sendKeys("Ergle");
//        WebElement postalCodeInputField = driver.findElement(By.id("postal-code"));
//        postalCodeInputField.sendKeys("LV-3401");
//
//        WebElement continueButton = driver.findElement(By.id("continue"));
//        continueButton.click();