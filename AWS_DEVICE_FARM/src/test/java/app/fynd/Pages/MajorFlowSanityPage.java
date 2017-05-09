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

package app.fynd.Pages;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * A page for alerts as sample
 */
public class MajorFlowSanityPage extends BasePage  {

	boolean allowAccessPopUpDisplayed = false ;
	
    /**
    * The Facebook Login Button Clicked
    */  
    @AndroidFindBy(id="co.go.fynd:id/button_facebook")
    MobileElement facebookButton;
    /**
    * The Chrome Accept term and Condition Button
    */    
    @AndroidFindBy(id="com.android.chrome:id/terms_accept")
    MobileElement chromeAcceptButton; 
    /**
    * Chrome No thanks Button
    */    
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(0)")
    MobileElement chromeNoThanksButton;
    /**
    * Facebook Iframe Username Textbox
    */     
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(0)")
    MobileElement fbusername; 
    /**
    * Facebook Iframe Password Textbox
    */     
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.EditText\").instance(1)")
    MobileElement password;
    /**
    * Facebook Iframe Log In Button
    */    
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\")")
    MobileElement logIn;
    /**
    * Facebook Authorize 'OK' Button
    */     
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(1)")
    MobileElement FbAuthroization;
    /**
    * Chrome Buttons
    */   
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.Button\").instance(1)")
    MobileElement FbContinue;
    /**
    * Fynd allow access popup allow button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/dialog_right_btn\")")
    MobileElement allowContactAccess;
    /**
    * Fynd app first Banner
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/offer_image\")")
    MobileElement selectBanner;
 
    /**
    * Fynd app Permission popup allow button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.android.packageinstaller:id/permission_allow_button\")")
    MobileElement premissionPopupAllowButton;
  
    /**
    * Fynd app Product Image
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/prod_image\")")
    MobileElement productImage;

    /**
    * Fynd app Product Name
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/brandTitle\")")
    MobileElement productName;
 
    /**
    * Fynd app Product Price
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/marked_down_price\")")
    MobileElement productPrice;

    /**
    * Fynd app Search Box
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/home_search_container\")")
    MobileElement searchBox;
    
    /**
    * Fynd app Search Text Box
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/search_src_text\")")
    MobileElement searchTextBox;
  
    /**
    * Fynd app Search Second Selection Item
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/recycler_item_text_parent\")")
    MobileElement searchSuggestions;
 
    /**
    * Fynd app Product Size
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/size_text\").clickable(true)")
    MobileElement productSize;
    
    /**
    * Fynd app PDP Buy Now Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/button_buy_now\")")
    MobileElement pdpBuyNowButton;

    /**
    * Fynd app cart Secure CheckOut Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/place_order\")")
    MobileElement cartSecureCheckOutButton;
    
    /**
    * Fynd app Proceed Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/button_proceed\")")
    MobileElement proceedButton;

    /**
    * Fynd app gif loader
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/progress_bar_gif\")")
    MobileElement gifLoader;

    /**
    * Fynd app payment page dialog 'YES' Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"android:id/button1\")")
    MobileElement paymentDialogYesButton;

    /**
    * Fynd app payment error page dialog 'close' Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/action_profile\")")
    MobileElement paymentErrorPageCloseButton;
    
    /**
    * Fynd app cart Remove Item Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/remove_button\")")
    MobileElement cartRemoveButton;
 
    /**
    * Fynd app payment Selector
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/menu_icon\")")
    List<WebElement> paymentSelector;
 
    /**
    * Fynd app Notification Icon
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/action_notification\")")
    MobileElement notificationIcon;
    
    /**
    * Fynd app payment Selector
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().className(\"android.widget.TextView\")")
    List<WebElement> subMenuList;
    
    /**
    * Fynd Brand page top sub menu
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/title\")")
    MobileElement brandTopMenuList; 
 
    /**
    * Fynd Brand List follow button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/follow\").className(\"android.widget.Button\")")
    List<WebElement> brandListFollowButton;
    
    /**
    * My Fynds collection brand
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/brand_collection_image\")")
    MobileElement collectionImage;

    /**
    * My Fynds add to Bag Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/move_to_bag\")")
    MobileElement MyFyndsAddToBag;
 
    /**
    * My Fynds add to bag popup Click Button
    */  
    @AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"co.go.fynd:id/save\")")
    MobileElement MyFyndsBrandPopUpAddToBagButton;    

    public MajorFlowSanityPage(AppiumDriver driver) {
        super(driver);
    }
    
    /**
     * clicks the facebook button
     * @throws InterruptedException 
     */
    public void facebookLogin() throws InterruptedException {
        handlePermissionPopUp();
    	facebookButton.click();
    	awsIntialMachineSetup();
    	//localMachineSetup();
    }
    
    /**
     * Follow the Brand
     * @throws InterruptedException 
     */
    public void followBrand() throws InterruptedException {
    	brandTopMenuList.click();
    	scroll(1);
    	for (WebElement webElement : brandListFollowButton) {
			System.out.println(webElement.getText());
		}
    	brandListFollowButton.get(0).getText();
    	brandListFollowButton.get(0).click();
    }
 
    /**
     * clicks on top sub menu
     * @throws InterruptedException 
     */
    public void selectTopMenu(String Text) throws InterruptedException {
    	
    	for (WebElement webElement : subMenuList) {
    		
    		System.out.println(webElement.getText());
    		
    	}
					switch (Text) {
					case "For You":
						subMenuList.get(1).click();
						break;
					case "Brands":
						subMenuList.get(7).click();
						System.out.println(subMenuList.get(2).getText());
						break;
					case "collections":
						subMenuList.get(8).click();
						break;
					case "My Fynds":
						subMenuList.get(9).click();
						break;
					default:
						subMenuList.get(10).click();
						break;
					}
    	
 }

    
    public void awsIntialMachineSetup() throws InterruptedException{
    	chromeAcceptButton.click();
    	System.out.println("Clicked on the Accept button");
    	System.out.println(chromeNoThanksButton.getText());
    	chromeNoThanksButton.click();
    	Thread.sleep(10000);
    	fbusername.sendKeys("pramod.kumar03@exclusively.com");
    	System.out.println("Entered Username");
    	scroll(1);
    	password.sendKeys("ah@2305208606");
    	System.out.println("Entered Password");
    	logIn.click();
    	System.out.println("Clicked on login button");
    	FbContinue.click();
    	System.out.println("Fb continue button");
    	Thread.sleep(3000);
    	FbAuthroization.click();
    	try {  		
    		allowAccessPopUpDisplayed=allowContactAccess.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
    	finally{
        	if (allowAccessPopUpDisplayed)
        	{
        	allowContactAccess.click();
        	}
    	}
        handlePermissionPopUp();
    }
     
    public void localMachineSetup() throws InterruptedException{
    	fbusername.sendKeys("pramod.kumar03@exclusively.com");
    	scroll(1);
    	password.sendKeys("ah@2305208606");
    	logIn.click();
    	FbAuthroization.click();
		allowContactAccess.click();
        handlePermissionPopUp();
    }
    
    public void scroll(int times) throws InterruptedException{
		
		Dimension dimensions = driver.manage().window().getSize();
		double screenHeightStart = (int) (dimensions.getHeight()*0.3 );
		int scrollStart = (int)screenHeightStart;
		double screenHeightEnd = (dimensions.getHeight()*0.1);
		int scrollEnd = (int)screenHeightEnd;
		for (int i = 1; i <= times; i++) {
			Thread.sleep(1000L);
			driver.swipe(0,scrollStart,0,scrollEnd,2000);
			System.out.println("scrolled : "+ i);
			
		}	
	}
	

    public void selectBanner() throws InterruptedException{
		//clicked on the first  banner
    	selectBanner.click();
		System.out.println("clicked on the first product");
		scroll(1);
	}

    public void selectBrandCollection() throws InterruptedException{
		//clicked on the first  collection brand
    	collectionImage.click();
		System.out.println("clicked on the first product");
		scroll(1);
	}   
    
    public void addMyFyndsToCart() throws InterruptedException{
		//clicked on the first  banner

	}    
    
    
    public void selectNotificationBanner() throws InterruptedException{
		//clicked on the first  banner
    	notificationIcon.click();
	}
    
	
    public void ScrolltoElementWithText(String text)
	{
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
	}
	
    public void handlePermissionPopUp(){
		boolean premissionPopupDisplayed = false;
		try {
			premissionPopupDisplayed = premissionPopupAllowButton.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if (premissionPopupDisplayed){
				premissionPopupAllowButton.click();
			}
			
		}
	}
	
 
    public HashMap<String, String> selectProduct(){
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/prod_image\")"))).click();
		productImage.click();
		//String product_name = waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/brandTitle\")"))).getText();
		//String product_price = waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/marked_down_price\")"))).getText();
		String product_name = productName.getText();
		String product_price = productPrice.getText();
		HashMap<String, String> ProductDetails = new HashMap<>();
		ProductDetails.put("name", product_name);
		ProductDetails.put("price", product_price);
		return ProductDetails;
	}
	
	
	public void search(String keyword){
		
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/home_search_container\")"))).click();
		searchBox.click();
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/search_src_text\")"))).sendKeys("Shirts");
		searchTextBox.sendKeys(keyword);
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/recycler_item_text_parent\")"))).click();
		searchSuggestions.click();
	}
	
	public void selectSize(){
		boolean sizeAvailable=false;
		try {
			sizeAvailable = productSize.isDisplayed();		
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
			if(sizeAvailable){
				productSize.click();
			}
			
		}
		

		System.out.println("selected the size");
	}
	
	public void addItemToCart() throws InterruptedException{
		//click on the Buynow Button
		pdpBuyNowButton.click();
		Thread.sleep(2000L);
		//Click on the CheckOut Button
		pdpBuyNowButton.click();
	}
	
	public void itemCheckOut(){
		
		ScrolltoElementWithText("Secure Checkout");
		//Click on cart SECURE CECKOUT BUTTON
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/place_order\")"))).click();
		cartSecureCheckOutButton.click();
		//Click on the Continue button on the address page
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/button_proceed\")"))).click();
		proceedButton.click();
	}
	
	public void paymentCheckOut(){
		//Click on Continue Button
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/button_proceed\")"))).click();
		proceedButton.click();
		//Click on Proceed to pay
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/button_proceed\")"))).click();
		proceedButton.click();
		//Thread.sleep(3000L);
		boolean gifLoaderStatus = false;
		try {
			do {

				gifLoaderStatus =gifLoader.isDisplayed();
				System.out.println(gifLoaderStatus);

			} while (!gifLoaderStatus);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if (gifLoaderStatus){
				System.out.println("GIF Loader is displayed");
			}
		}	
	}	
	
	public void goBackFromCheckoutFlow(){
		//Click Back Button
		driver.navigate().back();
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/back\")"))).click();

		//Click on the Dialog 'YES' Option
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")"))).click();
		paymentDialogYesButton.click();
		//Click on the Dialog 'YES' Option
		boolean payment_error_page =false;
		try {
			payment_error_page = paymentErrorPageCloseButton.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catched the exception");
		}
		finally{
			if (payment_error_page){
				paymentErrorPageCloseButton.click();
			}
		}
		
		
	}
	
	
	
	public void removeItemFromCart() throws InterruptedException, MalformedURLException {
	System.out.println("app is installed");
	//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/remove_button\")"))).click();
	cartRemoveButton.click();
	}
	
	
	public void selectPaymentMethod(String paymentType) throws InterruptedException, MalformedURLException {
		
		//waitgetForPageLoadAndroid(60).until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/menu_icon\")"))).isDisplayed();
		//List<WebElement> paymentcontainers=getAndroidDriver().findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"co.go.fynd:id/menu_icon\")"));
		List<WebElement> paymentcontainers=paymentSelector;
		
		switch (paymentType) {
		case "Add new cards":{
			//TODO
			paymentcontainers.get(3).click();
		}
			
			break;
		case "ICICI":{
			paymentcontainers.get(4).click();
		}
			break;
		case "HDFC":{
			paymentcontainers.get(5).click();
		}
			break;	
			
		case "AXIS":{
			paymentcontainers.get(6).click();
		}
			break;			
			
		case "SBI":{
			paymentcontainers.get(7).click();
		}
			break;			
		case "KOTAK":{
			paymentcontainers.get(8).click();
		}
			break;		
		case "PAYTM":{
			paymentcontainers.get(9).click();
		}
			break;
		case "MOBIKWIK":{
			paymentcontainers.get(10).click();
		}
			break;	
		case "PAYUMONEY":{
			paymentcontainers.get(11).click();
		}
			break;
		case "OLAMONEY":{
			paymentcontainers.get(12).click();
		}
		case "FREECHARGE":{
			paymentcontainers.get(13).click();
		}
			break;
		default:{
			paymentcontainers.get(4).click();
		}
			break;
		}
		
		
	}

	
	
	
	
	
	
	
	


    /**
     *
     * @return the message within the alert
     */
    public String getAlertText() {
        MobileElement alertMessage = (MobileElement) driver.findElementsByClassName("android.widget.TextView").get(1);
        return alertMessage.getText();
    }

//    /**
//     * accepts the alert
//     */
//    public void acceptAlertMessage() {
//        MobileElement alertOkButton = (MobileElement) driver.findElementsByClassName("android.widget.Button").get(0);
//        alertOkButton.click();
//    }
}