package PageObjects;

import SoftTest.BasePage;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class ChekoutCreditCard extends BasePage {

    CheckoutShipping checkoutShipping = new CheckoutShipping();

        private By paymentfield = By.xpath("//ul[@id='payment-method-block']/li[2]/div/div[2]/label");
        private By buttonsfield = By.xpath("//div[@id='payment-method-buttons-container']/input");

    public void userShouldAbleToClickOnCreditCard(){

        checkoutShipping.userShouldAbleToShippingNextDayair();

        Utils.clickElement(paymentfield);
        Utils.clickElement(buttonsfield);

    }
}
