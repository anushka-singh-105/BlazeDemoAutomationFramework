package tests;

import org.testng.Assert;


import org.testng.annotations.Test; 

import pages.ReservePage;
import base.BaseTest;
import pages.HomePage;

public class SearchFlightTest extends BaseTest {

    @Test
    public void searchFlight() {

        HomePage homePage = new HomePage(driver);

        homePage.selectDepartureCity("Boston");
        homePage.selectDestinationCity("London");
        homePage.clickFindFlights();
        
        ReservePage reservePage=new ReservePage(driver);
        
        reservePage.chooseFirstFlight();
        System.out.println(driver.getTitle());
        
        Assert.assertTrue(
        		driver.getTitle().contains("BlazeDemo Purchase"));

    }
}