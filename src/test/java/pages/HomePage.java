package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By fromPort = By.name("fromPort");
    By toPort = By.name("toPort");
    By findFlightsBtn = By.cssSelector("input[type='submit']");

    public void selectDepartureCity(String city) {
        new Select(driver.findElement(fromPort))
                .selectByVisibleText(city);
    }

    public void selectDestinationCity(String city) {
        new Select(driver.findElement(toPort))
                .selectByVisibleText(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }
}