package tests.goldSource;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;


public class SearchPage extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.goldSource.SearchPage.open();
    }

    @Test
    public void detailedSearchFiltersReturningNoResultsTest() {

        pages.goldSource.SearchPage.clickSearchInputFieldButton();
        String nonexistentArticle = "^^^^^^^^";
        pages.goldSource.SearchPage.enterMessageToSearchField(nonexistentArticle);
        pages.goldSource.SearchPage.clickDetailedSearchButton();
        String expectedNoResultMessage = "Det var ingen produkter som samsvarte med søkekriteriene.";
        Assert.assertEquals(pages.goldSource.SearchPage.getResultsMessage(), expectedNoResultMessage);
    }

    @Test
    public void searchAndAddToChartTest() {

        pages.goldSource.SearchPage.clickSearchInputFieldButton();
        pages.goldSource.SearchPage.chooseInStockRadio();
        String articleToBuy = "Mynt Tube \"Coin Safe\" 41mm";
        pages.goldSource.SearchPage.enterMessageToSearchField(articleToBuy);
        pages.goldSource.SearchPage.clickDetailedSearchButton();
        String countOfSameArticlesAddedToChart = "2";
        pages.goldSource.SearchPage.enterQuantityToBuy(countOfSameArticlesAddedToChart);
        String expectedAddToChartButtonValue = "Legg i handlevogn";
        Assert.assertEquals(pages.goldSource.SearchPage.getDisplayedAddToChartButton(), expectedAddToChartButtonValue);
        pages.goldSource.SearchPage.clickOnAddToChartButton();
        Assert.assertTrue(pages.goldSource.SearchPage.existsAdditionNotificationAlert());

    }
}

