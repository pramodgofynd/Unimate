

package app.fynd.Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * A base for all the pages within the suite
 */
public abstract class BasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 1000;

    /**
     * The driver
     */
    protected final AppiumDriver driver;
    

    /**
     * A base constructor that sets the page's driver
     *
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
     *
     * Please use the AppiumFieldDecorator class within the page factory. This way annotations
     * like @AndroidFindBy within the page objects.
     *
     * @param driver the appium driver created in the beforesuite method.
     */
    protected BasePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }
    


    /**
     * Tries three times to send text to element properly.
     *
     * Note: This method was needed because Appium sometimes sends text to textboxes incorrectly.
     *
     * @param input String to be sent
     * @param element WebElement to receive text, cannot be a secure text field.
     * @param appendNewLine true to append a new line character to incoming string when sending to element, else false
     *
     * @return true if keys were successfully sent, otherwise false.
     */
    protected boolean sendKeysToElement(String input, WebElement element, boolean appendNewLine) throws InterruptedException {
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;

        do {
            element.clear();
            Thread.sleep(KEYBOARD_ANIMATION_DELAY);

            if (appendNewLine) {
                element.sendKeys(input + "\n");
            } else {
                element.sendKeys(input);
            }

            Thread.sleep(XML_REFRESH_DELAY);
        } while (!element.getText().contains(input) && ++attempts < MAX_ATTEMPTS);

        return element.getText().contains(input);
    }
}