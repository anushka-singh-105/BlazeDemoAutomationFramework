package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservePage {

    WebDriver driver;

    public ReservePage(WebDriver driver) {
        this.driver = driver;
    }

    By chooseFlightBtn = By.cssSelector("table tbody tr:first-child input");

    public void chooseFirstFlight() {
        driver.findElement(chooseFlightBtn).click();
    }
}