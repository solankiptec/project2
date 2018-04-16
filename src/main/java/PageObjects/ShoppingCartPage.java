package PageObjects;

import SoftTest.BasePage;
import SoftTest.LoadProp;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 04/09/2017.
 */
public class ShoppingCartPage extends BasePage {

    AddTocart2Item addTocart2Item = new AddTocart2Item();
    LoadProp loadProp = new LoadProp();

       private By attributefield = By.xpath("//select[contains(@id,'checkout_attribute_1')]");
       private By optionfield = By.xpath("//option[contains(.,'Yes [+$10.00]')]");
       private By countryfield = By.xpath("//select[@class='country-input']");
       private By termsofservicefield = By.xpath("//input[@id='termsofservice']");
       private By checkoutfield = By.xpath("//button[@id='checkout']");

    public void userShouldAbleToFillTermsAndCondition(){

        addTocart2Item.userShouldAbleToAddToCart2Items();

        Utils.clickElement(attributefield);
        Utils.clickElement(optionfield);
        Utils.scrollPagep(0,150);
        Utils.selectByVisibleText(countryfield,loadProp.getProperty("Country"));
        try{
            boolean flag = Utils.isAlertPresent();
            System.out.println("Alert = " +flag);
        }catch (Exception e){
            e.printStackTrace();
        }
        Utils.clickElement(termsofservicefield);
        Utils.clickElement(checkoutfield);

    }
}
