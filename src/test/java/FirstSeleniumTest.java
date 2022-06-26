import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver chromeBrowser;

    @Test
    public void testPageTitle(){
        WebDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.navigate().to("https://www.lu.lv/");
        chromeBrowser.manage().window().maximize();
        String expectedTitle = "Latvijas Universitāte";
        String actualTitle = chromeBrowser.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        chromeBrowser.quit();
    }

    @AfterMethod
    public void closeBrowser(){
        chromeBrowser.quit();
    }
}
