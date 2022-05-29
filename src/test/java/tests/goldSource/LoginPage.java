package tests.goldSource;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginPage extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.goldSource.LoginPage.open();
    }


    @Test
    public void loginPageFormValidationTest() {

        pages.goldSource.LoginPage.clickOnLoginPageLink();
        String wrongEmailInput = "wrong user";
        String wrongPasswordInput = "wrong password";
        pages.goldSource.LoginPage.typeLoginEmail(wrongEmailInput);
        pages.goldSource.LoginPage.typeLoginPassword(wrongPasswordInput);
        pages.goldSource.LoginPage.clickSubmitButton();
        String actualUnknownUserMessage;
        actualUnknownUserMessage = "Beklager, ukjent brukernavn eller passord. Har du glemt passordet?";
        Assert.assertTrue(pages.goldSource.LoginPage.getDisplayedInvalidUserMessage().contains(actualUnknownUserMessage));
    }

    @Test
    public void createNewAccountFormValidationTest() {
        pages.goldSource.LoginPage.clickOnLoginPageLink();
        pages.goldSource.LoginPage.clickLoginPageCreateAccountLink();

        String wrongEmailInput = "wrong user";
        pages.goldSource.LoginPage.typeCreateAccountEmail(wrongEmailInput);
        pages.goldSource.LoginPage.typeCreateAccountPassword1("Azerty123");
        pages.goldSource.LoginPage.typeCreateAccountPassword2("Azerty1234");
        String expectedPassStrength = "Sterk";
        Assert.assertEquals(pages.goldSource.LoginPage.getDisplayedPassStrength(), expectedPassStrength);
        pages.goldSource.LoginPage.clickSubmitButton();
        String expectedPasswordsNotEquals = "Passordene er ikke like.";
        Assert.assertEquals(pages.goldSource.LoginPage.getDisplayedPasswordsNotEquals(), expectedPasswordsNotEquals);
        String expectedInvalidEmail = "E-postadressen wrong user er ikke gyldig.";
        Assert.assertEquals(pages.goldSource.LoginPage.getDisplayedNewEmailInvalid(), expectedInvalidEmail);
    }
}