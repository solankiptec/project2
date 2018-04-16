package PageObjects;

import SoftTest.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 06/08/2017.
 */
public class BrowserSelector extends BasePage
{

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\WebDriverNew\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "D:\\WebDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//        switch (browser){
//            case "chrome"  : driver = new FirefoxDriver(); break;
//
//            case "ie"   : System.setProperty("webdriver.chrome.driver", "D\\WebDriverNew\\chromedrive.exe");
//                driver = new ChromeDriver();
//                break;
//
//            case "firefox"       : System.setProperty("webdriver.ie.driver", "D\\WebDriver\\IEDriverServer.exe");
//                driver = new InternetExplorerDriver();
//                break;
//
//            default:        System.out.println("Invalid browser or wrong browser typed");
//        }
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }





}
