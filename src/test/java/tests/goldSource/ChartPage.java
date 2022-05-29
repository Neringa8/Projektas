package tests.goldSource;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ChartPage extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.goldSource.ChartPage.open();
    }

    @Test
    public void chartPageToSilverSubscriptionTest() {

        String expectedLoginRequiredHeader = "Innlogging påkrevd";
        Assert.assertEquals(pages.goldSource.ChartPage.getLoginIsRequiredHeader(), expectedLoginRequiredHeader);
        pages.goldSource.ChartPage.clickReadMore(); // read more = les mer for special offers
        pages.goldSource.ChartPage.clickOnSilverEaglesLink();  // choose from recommended categories: Silver Eagles from USA
        String expectedSilverEaglesHeader = "Silver Eagles";
        Assert.assertEquals(pages.goldSource.ChartPage.getSilverEaglesPageHeader(), expectedSilverEaglesHeader);
    }
}


