package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.PurchasePage;
import pages.ReservePage;

public class EndToEndBookingTest extends BaseTest {

    @Test
    public void completeFlightBooking() {

        HomePage homePage = new HomePage(driver);

        homePage.selectDepartureCity("Boston");
        homePage.selectDestinationCity("London");
        homePage.clickFindFlights();

        ReservePage reservePage =
                new ReservePage(driver);

        reservePage.chooseFirstFlight();

        PurchasePage purchasePage =
                new PurchasePage(driver);

        purchasePage.enterName("Anushka");
        purchasePage.enterAddress("Dehradun");
        purchasePage.enterCity("Dehradun");
        purchasePage.enterState("Uttarakhand");
        purchasePage.enterZip("248001");
        purchasePage.enterCardNumber("123456789");

        purchasePage.clickPurchaseFlight();
        
        ConfirmationPage comfirmationPage=new ConfirmationPage(driver);

        Assert.assertTrue(
                driver.getPageSource()
                        .contains("Thank you for your purchase today!"));
    }
}




