package PageObjects;

import SoftTest.BasePage;
import SoftTest.LoadProp;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class CheckoutPage extends BasePage {

     LoadProp loadProp = new LoadProp();
     ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        private By CountryIdfield = By.id("BillingNewAddress_CountryId");
        private By StateProvinceIdfield = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
        private By cityfield = By.xpath("//input[@id='BillingNewAddress_City']");
        private By addressfield = By.id("BillingNewAddress_Address1");
        private By postalcodefield = By.id("BillingNewAddress_ZipPostalCode");
        private By phonenumberfield = By.id("BillingNewAddress_PhoneNumber");
        private By countinuefield = By.xpath("//div[@id='billing-buttons-container']/input");

     public void userShouldAbleToEnterValidCredentialinCheckoutPage(){

          shoppingCartPage.userShouldAbleToFillTermsAndCondition();

          Utils.selectByVisibleText(CountryIdfield,loadProp.getProperty("Country"));
          Utils.selectByVisibleText(StateProvinceIdfield,loadProp.getProperty("StateProvinceId"));
          Utils.clearAndEnterText(cityfield,loadProp.getProperty("city"));
          Utils.clearAndEnterText(addressfield,loadProp.getProperty("address"));
          Utils.clearAndEnterText(postalcodefield,loadProp.getProperty("postalcade"));
          Utils.clearAndEnterText(phonenumberfield,loadProp.getProperty("phonenumber"));
          Utils.clickElement(countinuefield);


     }
}
