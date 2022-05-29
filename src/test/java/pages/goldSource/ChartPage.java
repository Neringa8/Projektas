package pages.goldSource;

import pages.Common;
import pages.Locators;

public class ChartPage {

    public static void open() {
        Common.openUrl("https://goldsource.no/cart");
    }

    public static String getLoginIsRequiredHeader() {
        return Common.getElementText(Locators.GoldSource.ChartPageCoordinates.loginRequiredHeader);
    }

    public static String getSilverEaglesPageHeader() {
        return Common.getElementText(Locators.GoldSource.ChartPageCoordinates.silverEaglesHeader);
    }

    public static void clickReadMore() {
        Common.clickElement(Locators.GoldSource.ChartPageCoordinates.subscribeButton);
    }

    public static void clickOnSilverEaglesLink() {
        Common.clickElement(Locators.GoldSource.ChartPageCoordinates.subscribeSilverLink);
    }
}

