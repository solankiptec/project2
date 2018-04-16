package PageObjects;
import SoftTest.BasePage;
import org.openqa.selenium.By;
/**
 * Created by Welcome on 06/08/2017.
 */
public class HomePage extends BasePage
{
    public void navigateToRegistrationPage()
    {
        driver.findElement(By.linkText("Register")).click();
    }


}