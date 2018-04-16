package PageObjects;

import SoftTest.BasePage;
import SoftTest.LoadProp;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class CheckoutCreditCardDetails extends BasePage{

    LoadProp loadProp = new LoadProp();
    ChekoutCreditCard chekoutCreditCard = new ChekoutCreditCard();

       private By CreditCardfield = By.xpath("//select[contains(@name,'CreditCardType')]");
       private By CreditCartfield = By.xpath("//option[contains(@value,'MasterCard')] ");
       private By CardholderNamefield = By.xpath("//input[@id='CardholderName']");
       private By CardNumberfield = By.xpath("//input[@id='CardNumber']");
       private By ExpireMonthfield = By.xpath("//select[@id='ExpireMonth']");
       private By ExpireYearfield = By.xpath("//select[@id='ExpireYear']");
       private By CardCodefield = By.xpath("//input[@maxlength='4']");
       private By continuufield = By.xpath("//div[@id='payment-info-buttons-container']/input");

    public void userShouldAbleToEnterValidCreditCardDetails(){

       chekoutCreditCard.userShouldAbleToClickOnCreditCard();

        Utils.clickElement(CreditCardfield);
        Utils.clickElement(CreditCartfield);
        Utils.clearAndEnterText(CardholderNamefield,loadProp.getProperty("CardholderName"));
        Utils.clearAndEnterText(CardNumberfield,loadProp.getProperty("CardNumber"));
        Utils.selectByVisibleText(ExpireMonthfield,loadProp.getProperty("ExpireMonth"));
        Utils.selectByVisibleText(ExpireYearfield,loadProp.getProperty("ExpireYear"));
        Utils.clearAndEnterText(CardCodefield,loadProp.getProperty("CardCode"));
        Utils.clickElement(continuufield);
    }

}
