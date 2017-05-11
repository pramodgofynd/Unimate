/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package app.fynd.Tests;



import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import app.fynd.Pages.*;
import app.fynd.Tests.AbstractBaseTests.TestBase;




/**
 * Tests for alert page
 */
public class PlaceOrderSanity extends TestBase {
    private static final String BANK_NAME = "AXIS";
    private MajorFlowSanityPage majorFlowSanityPage;
    
    
    @Override
    public String getName() {
        return "Alerts";
    }

    /**
     * Sets up the major flow sanity view page
     */
    @BeforeTest
    @Override
    public void setUpPage() {
    	majorFlowSanityPage = new MajorFlowSanityPage(driver);
    }

    /**
     * Place order by searching an item,
     * then verifying the 
     * accepting .
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    @Test(enabled=true , priority=0)
    public void placeOrderBySearch() throws InterruptedException, MalformedURLException{
        //alertPage.clickAlertsButton();
    	
        Thread.sleep(3000);

        majorFlowSanityPage.facebookLogin();
        System.out.println("facebookbutton is clicked");

        majorFlowSanityPage.search("Play");
		//selectBanner();
        majorFlowSanityPage.scroll(1);
		 HashMap<String, String> product_Details= majorFlowSanityPage.selectProduct();	 
		 majorFlowSanityPage.scroll(3);
		 majorFlowSanityPage.selectSize();
		//"Selected the size of the Product"
		 majorFlowSanityPage.addItemToCart();
		//"Successfully added the item in the cart"
		//majorFlowSanityPage.ScrolltoElementWithText("Secure Checkout");
		majorFlowSanityPage.itemCheckOut();
		//"Checkout flow is successful"
		majorFlowSanityPage.selectPaymentMethod(BANK_NAME);
		//"Select the Payment Method"
		majorFlowSanityPage.paymentCheckOut();
		//"Payment Checkout flow is successful"
		majorFlowSanityPage.goBackFromCheckoutFlow();
		majorFlowSanityPage.removeItemFromCart();
		//"Successfully removed the item from the cart"
  
        //Assert.assertEquals(alertPage.getAlertText(), ALERT_MESSAGE);
        //alertPage.acceptAlertMessage();
    }
    
    /**
     * Place order by selecting the Offer Banner,
     * then verifying the 
     * accepting .
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    @Test(enabled=false , dependsOnMethods="placeOrderBySearch")
    public void placeOrderByBanner() throws InterruptedException, MalformedURLException{
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
       //majorFlowSanityPage.search("Play");
		majorFlowSanityPage.selectBanner();
		 HashMap<String, String> product_Details= majorFlowSanityPage.selectProduct();	 
		 majorFlowSanityPage.scroll(3);
		 majorFlowSanityPage.selectSize();
		//"Selected the size of the Product"
		 majorFlowSanityPage.addItemToCart();
		//"Successfully added the item in the cart"
		//majorFlowSanityPage.ScrolltoElementWithText("Secure Checkout");
		majorFlowSanityPage.itemCheckOut();
		//"Checkout flow is successful"
		majorFlowSanityPage.selectPaymentMethod(BANK_NAME);
		//"Select the Payment Method"
		majorFlowSanityPage.paymentCheckOut();
		//"Payment Checkout flow is successful"
		majorFlowSanityPage.goBackFromCheckoutFlow();
		majorFlowSanityPage.removeItemFromCart();
		//"Successfully removed the item from the cart"
  
        //Assert.assertEquals(alertPage.getAlertText(), ALERT_MESSAGE);
        //alertPage.acceptAlertMessage();
    }
    
    /**
     * Place order by selecting the Notification,
     * then verifying the 
     * accepting .
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    @Test(enabled=false ,dependsOnMethods="placeOrderByBanner")
    public void placeOrderByNotification() throws InterruptedException, MalformedURLException{
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
        //majorFlowSanityPage.search("Play");
        majorFlowSanityPage.selectNotificationBanner();
		majorFlowSanityPage.selectBanner();
		 HashMap<String, String> product_Details= majorFlowSanityPage.selectProduct();	 
		 majorFlowSanityPage.scroll(3);
		 majorFlowSanityPage.selectSize();
		//"Selected the size of the Product"
		 majorFlowSanityPage.addItemToCart();
		//"Successfully added the item in the cart"
		//majorFlowSanityPage.ScrolltoElementWithText("Secure Checkout");
		majorFlowSanityPage.itemCheckOut();
		//"Checkout flow is successful"
		majorFlowSanityPage.selectPaymentMethod(BANK_NAME);
		//"Select the Payment Method"
		majorFlowSanityPage.paymentCheckOut();
		//"Payment Checkout flow is successful"
		majorFlowSanityPage.goBackFromCheckoutFlow();
		majorFlowSanityPage.removeItemFromCart();
		//"Successfully removed the item from the cart"
  
        //Assert.assertEquals(alertPage.getAlertText(), ALERT_MESSAGE);
        //alertPage.acceptAlertMessage();
    }
    
    
    /**
     * Place order by selecting the My fynd Offers,
     * then verifying the 
     * accepting .
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    @Test(enabled=false )
    public void placeOrderByMyFynd() throws InterruptedException, MalformedURLException{
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().back();
    	
    	//majorFlowSanityPage.facebookLogin();
		majorFlowSanityPage.selectTopMenu("Brands");
		majorFlowSanityPage.followBrand();
		driver.navigate().back();
		majorFlowSanityPage.selectTopMenu("My Fynds");
        
		majorFlowSanityPage.selectBrandCollection();
		 HashMap<String, String> product_Details= majorFlowSanityPage.selectProduct();	 
		 majorFlowSanityPage.scroll(3);
		 majorFlowSanityPage.selectSize();
		//"Selected the size of the Product"
		 majorFlowSanityPage.addItemToCart();
		//"Successfully added the item in the cart"
		//majorFlowSanityPage.ScrolltoElementWithText("Secure Checkout");
		majorFlowSanityPage.itemCheckOut();
		//"Checkout flow is successful"
		majorFlowSanityPage.selectPaymentMethod(BANK_NAME);
		//"Select the Payment Method"
		majorFlowSanityPage.paymentCheckOut();
		//"Payment Checkout flow is successful"
		majorFlowSanityPage.goBackFromCheckoutFlow();
		majorFlowSanityPage.removeItemFromCart();
		//"Successfully removed the item from the cart"
  
        //Assert.assertEquals(alertPage.getAlertText(), ALERT_MESSAGE);
        //alertPage.acceptAlertMessage();
    }
    
}
    
    
    
    
    





