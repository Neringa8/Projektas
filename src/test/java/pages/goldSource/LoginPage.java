package pages.goldSource;

import pages.Common;
import pages.Locators;

public class LoginPage {


    public static void open() {
        Common.openUrl("https://www.goldsource.no");
    }



    public static String getDisplayedInvalidUserMessage() {
        return Common.getElementText(Locators.GoldSource.LoginPageCoordinates.unknownUserMessage);
    }

    public static String getDisplayedPassStrength() {
        return Common.getElementText(Locators.GoldSource.LoginPageCoordinates.createPasswordStrength);
    }

    public static String getDisplayedNewEmailInvalid() {
        return Common.getElementText(Locators.GoldSource.LoginPageCoordinates.newEmailInvalidMessage);
    }

    public static String getDisplayedPasswordsNotEquals() {
        return Common.getElementText(Locators.GoldSource.LoginPageCoordinates.newPasswordsNotEqualsMessage);
    }

    public static void clickOnLoginPageLink() {
        Common.clickElement(Locators.GoldSource.LoginPageCoordinates.loginLink);
    }

    public static void typeLoginEmail(String message) {
        Common.clearElement(Locators.GoldSource.LoginPageCoordinates.userNameInput);
        Common.sendKeysToElement(Locators.GoldSource.LoginPageCoordinates.userNameInput, message);
    }

    public static void typeLoginPassword(String message) {
        Common.clearElement(Locators.GoldSource.LoginPageCoordinates.passwordInput);
        Common.sendKeysToElement(Locators.GoldSource.LoginPageCoordinates.passwordInput, message);
    }

    public static void clickSubmitButton() {
        Common.clickElement(Locators.GoldSource.LoginPageCoordinates.submitButton);
    }

    public static void clickLoginPageCreateAccountLink() {
        Common.clickElement(Locators.GoldSource.LoginPageCoordinates.createAccountLink);
    }

    public static void typeCreateAccountEmail(String message) {
        Common.clearElement(Locators.GoldSource.LoginPageCoordinates.createAccountEmailInput);
        Common.sendKeysToElement(Locators.GoldSource.LoginPageCoordinates.createAccountEmailInput, message);
    }

    public static void typeCreateAccountPassword1(String message) {
        Common.clearElement(Locators.GoldSource.LoginPageCoordinates.createAccountPasswordInput1);
        Common.sendKeysToElement(Locators.GoldSource.LoginPageCoordinates.createAccountPasswordInput1, message);
    }

    public static void typeCreateAccountPassword2(String message) {
        Common.clearElement(Locators.GoldSource.LoginPageCoordinates.createAccountPasswordInput2);
        Common.sendKeysToElement(Locators.GoldSource.LoginPageCoordinates.createAccountPasswordInput2, message);
    }
}





