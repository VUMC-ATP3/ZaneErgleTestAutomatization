package mavenTestNGHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {

    WebDriver chromeBrowser;

    @Test
    public void testPageTitle(){
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.navigate().to("https://www.apollo.lv/");
        chromeBrowser.manage().window().maximize();
        String expectedTitle = "Apollo.lv";
        String actualTitle = chromeBrowser.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        chromeBrowser.quit();
    }

    @Test
    public void testPageTitle1(){
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.navigate().to("https://twitter.com/");
        chromeBrowser.manage().window().maximize();
//        String expectedTitle = "Twitter. It’s what’s happening / Twitter";
        String expectedTitle = "Twitter. It’s what’s happening / Twitter3";
        String actualTitle = chromeBrowser.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        chromeBrowser.quit();
    }
}
