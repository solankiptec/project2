package SoftTest;

//import PageObjects.BrowserSelector;
import PageObjects.BrowserSelector;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import java.io.File;

/**
 * Created by Welcome on 06/08/2017.
 */
public class BaseTest extends BasePage
{
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    @BeforeMethod
    public void OpenBrowser()
    {
        browserSelector.selectBrowser(loadProp.getProperty("browser"));
        driver.get(loadProp.getProperty("baseUrl"));
        driver.manage().deleteAllCookies();
    }
  //  @AfterMethod
    public static void tearDown(ITestResult result)
    {
        // Here will compare if test is failing then only it will enter into if condition
        if (ITestResult.FAILURE == result.getStatus())
        {
            try {
                // Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

                // Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e)
            {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
    }
}
