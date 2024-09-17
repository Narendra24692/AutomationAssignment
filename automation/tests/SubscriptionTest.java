package com.automation.tests;

import com.automation.base.BaseTest;
import com.automation.pages.SubscriptionPage;
import org.testng.annotations.Test;

public class SubscriptionTest extends BaseTest {

    @Test
    public void testSubscriptionPackages() {
        SubscriptionPage subscriptionPage = new SubscriptionPage(driver);

        System.out.println("Validating SA packages:");
        subscriptionPage.validateCountryPackages("sa");

        System.out.println("\nValidating Kuwait packages:");
        subscriptionPage.validateCountryPackages("kw");

        System.out.println("\nValidating Bahrain packages:");
        subscriptionPage.validateCountryPackages("bh");
    }
}
