package PageObjects;

import SoftTest.BasePage;
import SoftTest.LoadProp;
import SoftTest.Utils;
import org.openqa.selenium.By;

/**
 * Created by Welcome on 06/08/2017.
 */
public class RegistrationPage extends BasePage {

    LoadProp loadProp = new LoadProp();

       private By genderMaleField = By.id("gender-male");
       private By FirstNameField = By.id("FirstName");
       private By LastNameField = By.id("LastName");
       private By DateOfBirthDayField = By.name("DateOfBirthDay");
       private By DateOfBirthMonthField = By.name("DateOfBirthMonth");
       private By DateOfBirthYearField = By.name("DateOfBirthYear");
       private By EmailField = By.id("Email");
       private By CompanyField = By.id("Company");
       private By NewsletterField = By.id("Newsletter");
       private By PasswordField = By.id("Password");
       private By ConfirmPasswordField = By.id("ConfirmPassword");
       private By REGISTERField = By.id("register-button");


    public void userShoudRegister()
    {
        Utils.clickElement(genderMaleField);
        Utils.clearAndEnter(FirstNameField, loadProp.getProperty("firstName"));
        Utils.clearAndEnter(LastNameField,loadProp.getProperty("lastName"));
        Utils.selectByVisibleText(DateOfBirthDayField,loadProp.getProperty("dateOfBirthDay"));
        Utils.selectByVisibleText(DateOfBirthMonthField,loadProp.getProperty("dateOfBirthMonth"));
        Utils.selectByVisibleText(DateOfBirthYearField,loadProp.getProperty("dateOfBirthYear"));
        Utils.clearAndEnterText(EmailField,loadProp.getProperty("email").toLowerCase() + Utils.randomNumber() + "@gmail.com");
        Utils.clearAndEnterText(CompanyField,loadProp.getProperty("company"));
        Utils.clickElement(NewsletterField);
        Utils.clearAndEnterText(PasswordField,loadProp.getProperty("password"));
        Utils.clearAndEnterText(ConfirmPasswordField,loadProp.getProperty("confirmPassword"));
        Utils.clickElement(REGISTERField);
    }


}
