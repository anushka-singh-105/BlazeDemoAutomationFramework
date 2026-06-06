package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zipCode = By.id("zipCode");
    By cardNumber = By.id("creditCardNumber");

    By purchaseFlightBtn =
            By.cssSelector("input[type='submit']");

    public void enterName(String value) {
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys(value);
    }

    public void enterAddress(String value) {
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(value);
    }

    public void enterCity(String value) {
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(value);
    }

    public void enterState(String value) {
        driver.findElement(state).clear();
        driver.findElement(state).sendKeys(value);
    }

    public void enterZip(String value) {
        driver.findElement(zipCode).clear();
        driver.findElement(zipCode).sendKeys(value);
    }

    public void enterCardNumber(String value) {
        driver.findElement(cardNumber).clear();
        driver.findElement(cardNumber).sendKeys(value);
    }

    public void clickPurchaseFlight() {
        driver.findElement(purchaseFlightBtn).click();
    }
}