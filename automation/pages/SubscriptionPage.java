package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubscriptionPage {
    private WebDriver driver;

    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateCountryPackages(String countryCode) {
        String countrySelector = String.format("div.package.%s", countryCode);
        List<WebElement> packages = driver.findElements(By.cssSelector(countrySelector));

        for (WebElement packageElement : packages) {
            String packageType = packageElement.findElement(By.cssSelector(".package-type")).getText();
            String packagePrice = packageElement.findElement(By.cssSelector(".package-price")).getText();
            String packageCurrency = packageElement.findElement(By.cssSelector(".package-currency")).getText();

            System.out.println("Package Type: " + packageType);
            System.out.println("Price: " + packagePrice);
            System.out.println("Currency: " + packageCurrency);
            System.out.println("-----");
        }
    }
}
