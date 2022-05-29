package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class GoldSource {

        public static class MainSearchPageCoordinates {

            public static By searchInputFieldButton = By.xpath("//*[@id='content']/div[1]/form/input[2]");
            public static By searchInputField = By.xpath("//*[@id='edit-combine']");
            public static By inStockRadio = By.xpath("//*[@id='edit-commerce-stock-value-1']");
            public static By detailedSearchButton = By.xpath("//*[@id='edit-submit-product-search']");
            public static By noResultsMessageElement = By.xpath("//*[@class='view-empty']");
            public static By itemQuantityInput = By.xpath("//*[@id='edit-quantity']");
            public static By addToChartButton = By.xpath("//*[@id='edit-submit']");
            public static By notificationAlert = By.xpath("//*[@class='message-inner']");
        }

        public static class ChartPageCoordinates {

            public static By subscribeButton = By.xpath("//*[@id='mc-embedded-subscribe']");
            public static By subscribeSilverLink = By.xpath("//*[@id='content']/article/div[1]/div/p[1]/a[1]");
            public static By silverEaglesHeader = By.xpath("//*[@id='page-title']");
            public static By loginRequiredHeader = By.xpath("//*[@id='block-block-8']/h2");
        }

        public static class LoginPageCoordinates {
            public static By loginLink = By.xpath("//*[@id='block-menu-menu-user-menu']/ul/li[1]/a");
            public static By submitButton = By.xpath("//*[@id='edit-submit']");
            public static By unknownUserMessage = By.xpath("//*[@id='content']/div[2]");
            public static By userNameInput = By.xpath("//*[@id='edit-name']");
            public static By passwordInput = By.xpath("//*[@id='edit-pass']");
            public static By createAccountLink = By.xpath("//*[@id='user-login']/div/div[2]/a");
            public static By newPasswordsNotEqualsMessage = By.xpath("//*[@id='content']/div[2]/ul/li[1]");
            public static By newEmailInvalidMessage = By.xpath("//*[@id='content']/div[2]/ul/li[2]");
            public static By createAccountEmailInput = By.xpath("//*[@id='edit-mail']");
            public static By createAccountPasswordInput1 = By.xpath("//*[@id='edit-pass-pass1']");
            public static By createAccountPasswordInput2 = By.xpath("//*[@id='edit-pass-pass2']");
            public static By createPasswordStrength = By.xpath("//*[@id='user_register_form']/div[2]/div[1]/div/div[1]");

        }
    }
}




