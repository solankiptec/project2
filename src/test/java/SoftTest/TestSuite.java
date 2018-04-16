package SoftTest;

import PageObjects.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Welcome on 06/08/2017.
 */
public class TestSuite extends BaseTest
{
    HomePage homepage = new HomePage();
    RegistrationPage registrationpage = new RegistrationPage();
    AddTocart2Item addTocart2Item = new AddTocart2Item();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CheckoutShipping checkoutShipping = new CheckoutShipping();
    ChekoutCreditCard chekoutCreditCard = new ChekoutCreditCard();
    CheckoutCreditCardDetails checkoutCreditCardDetails = new CheckoutCreditCardDetails();
    CheckoutConformPage checkoutConformPage = new CheckoutConformPage();


@Test
   public void NavigationToRegisterPage()
   {
    homepage.navigateToRegistrationPage();
    registrationpage.userShoudRegister();
    String expected = "Your registration completed";
    String actual = driver.findElement(By.className("result")).getText();
    Assert.assertEquals(actual, expected, "Assertion to verify if user is able to register successfully on NopCommerce registration page has failed. Please check details again.");
   }
    @Test
    public void navigationToRegistreEmailFriend ()
    {
    homepage.navigateToRegistrationPage();
    addTocart2Item.userShouldAbleToAddToCart2Items();
    }
    @Test
    public void userShouldAbleToFillTermsAndConditions(){
        homepage.navigateToRegistrationPage();
        shoppingCartPage.userShouldAbleToFillTermsAndCondition();
    }
    @Test
    public void userShouldAbleToEnterValidCredentialsInCkeckoutPage(){
        homepage.navigateToRegistrationPage();
        checkoutPage.userShouldAbleToEnterValidCredentialinCheckoutPage();
    }
    @Test
    public void userShouldAbleToChechoutcountinue(){
        homepage.navigateToRegistrationPage();
        checkoutShipping.userShouldAbleToShippingNextDayair();
    }
    @Test
    public void userShouldAbleToClickOnCreditCardOnChechoutPage(){
        homepage.navigateToRegistrationPage();
        chekoutCreditCard.userShouldAbleToClickOnCreditCard();
    }
    @Test
    public void userShouldAbleToFillValidCreditCardDetails(){
        homepage.navigateToRegistrationPage();
        checkoutCreditCardDetails.userShouldAbleToEnterValidCreditCardDetails();
    }
    @Test
    public void userShouldAbleToCheckoutConforms(){
        homepage.navigateToRegistrationPage();
        checkoutConformPage.userShouldAbleToConformCheckout();
        String expected = "Your order has been successfully processed!";
        String actual = driver.findElement(By.xpath("//strong[contains(.,'Your order has been successfully processed!')]")).getText();
        Assert.assertEquals(actual, expected, "Assertion to verify that user is able to buy item successfully on NopCommerce.");
    }
}





