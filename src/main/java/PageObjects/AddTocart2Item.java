package PageObjects;

import SoftTest.BasePage;
import SoftTest.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Welcome on 08/08/2017.
 */
public class AddTocart2Item extends BasePage {

    RegistrationPage registrationPage = new RegistrationPage();
    Utils tc = new Utils("");
    Utils utils  = new Utils("");

        private By CONTINUEField = By.name("register-continue");
        private By ComputersField = By.linkText("Computers");
        private By DesktopsField = By.linkText("Desktops");
        private By AddToCarttField = By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]");
        private By close1Field = By.className("close");
        private By AddToCartField = By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/div/div[2]/div[3]/div[2]/input[1]");
        private By close2Field = By.className("close");
        private By cartField = By.linkText("Shopping cart");

    public void userShouldAbleToAddToCart2Items()
    {
        registrationPage.userShoudRegister();
        utils.captureScreenShot(driver);
        tc.captureScreenShot(driver);

        Utils.clickElement(CONTINUEField);
        Utils.clickElement(ComputersField);
        Utils.clickElement(DesktopsField);
        utils.hoverEffect();
        Utils.clickElement(AddToCarttField);
        utils.scrollPage();
        Utils.clickElement(close1Field);
        Utils.clickElement(AddToCartField);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/div/div[2]/div[3]/div[2]/input[1]")));
        Utils.clickElement(close2Field);
        utils.scrollPagep(0,-250);
        Utils.clickElement(cartField);
        wait = new WebDriverWait(driver, 6);
        element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shopping cart")));
        Utils.scrollPagep(0,140);










    }


}
