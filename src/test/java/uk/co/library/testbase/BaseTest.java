package uk.co.library.testbase;

import org.openqa.selenium.chrome.ChromeOptions;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        selectBrowser(browser); }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
    //    closeBrowser();
    }
}
