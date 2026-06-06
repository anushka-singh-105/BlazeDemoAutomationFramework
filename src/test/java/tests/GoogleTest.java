package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyHomePage() {

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("BlazeDemo"));
    }
}