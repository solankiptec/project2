package PageObjects;

import SoftTest.BasePage;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class CheckoutConformPage extends BasePage {

    CheckoutCreditCardDetails checkoutCreditCardDetails = new CheckoutCreditCardDetails();

       private By confirmfield =By.xpath("//div[@id='confirm-order-buttons-container']/input");

    public void userShouldAbleToConformCheckout(){

        checkoutCreditCardDetails.userShouldAbleToEnterValidCreditCardDetails();
        Utils.clickElement(confirmfield);

    }
}
