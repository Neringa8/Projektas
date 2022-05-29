package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import java.util.List;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clearElement(By locator) {
        getElement(locator).clear();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static Boolean isElementPresent(By locator) {
        List<WebElement> elements = getElements(locator);
        if (elements.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
