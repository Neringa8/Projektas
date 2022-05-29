package pages.goldSource;

import pages.Common;
import pages.Locators;

public class SearchPage {

    public static void open() {
        Common.openUrl("https://goldsource.no/");
    }

    public static String getResultsMessage() {
        return Common.getElementText(Locators.GoldSource.MainSearchPageCoordinates.noResultsMessageElement);
    }

    public static String getDisplayedAddToChartButton() {
        return Common.getElementAttributeValue(Locators.GoldSource.MainSearchPageCoordinates.addToChartButton, "value");
    }

    public static boolean existsAdditionNotificationAlert() {
        return Common.isElementPresent(Locators.GoldSource.MainSearchPageCoordinates.notificationAlert);
    }

    public static void clickSearchInputFieldButton() {
        Common.clickElement(Locators.GoldSource.MainSearchPageCoordinates.searchInputFieldButton);
    }

    public static void clickDetailedSearchButton() {
        Common.clickElement(Locators.GoldSource.MainSearchPageCoordinates.detailedSearchButton);
    }

    public static void chooseInStockRadio() {
        Common.clickElement(Locators.GoldSource.MainSearchPageCoordinates.inStockRadio);
    }

    public static void enterMessageToSearchField(String message) {
        Common.clearElement(Locators.GoldSource.MainSearchPageCoordinates.searchInputField);
        Common.sendKeysToElement(Locators.GoldSource.MainSearchPageCoordinates.searchInputField, message);
    }

    public static void enterQuantityToBuy(String message) {
        Common.clearElement(Locators.GoldSource.MainSearchPageCoordinates.itemQuantityInput);
        Common.sendKeysToElement(Locators.GoldSource.MainSearchPageCoordinates.itemQuantityInput, message);
    }

    public static void clickOnAddToChartButton() {
        Common.clickElement(Locators.GoldSource.MainSearchPageCoordinates.addToChartButton);
    }
}



