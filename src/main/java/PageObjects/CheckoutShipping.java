package PageObjects;

import SoftTest.BasePage;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class CheckoutShipping extends BasePage {

    CheckoutPage checkoutPage = new CheckoutPage();

       private By shippingfield = By.xpath("//div[@id='checkout-shipping-method-load']/div/div/ul/li[2]/div[1]");
       private By containerfield = By.xpath("//div[@id='shipping-method-buttons-container']/input");

    public void userShouldAbleToShippingNextDayair(){

        checkoutPage.userShouldAbleToEnterValidCredentialinCheckoutPage();
        Utils.clickElement(shippingfield);
        Utils.clickElement(containerfield);

    }
}
