package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartConfirmationPopup extends BasePage{

    private final By confirmationSelector = By.xpath("//a[@title='Proceed to checkout']");

    public AddToCartConfirmationPopup(WebDriver browser) {
        super(browser);
        wait.until(ExpectedConditions.elementToBeClickable(confirmationSelector));
    }

    public void clickConfirmation(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmationSelector));
        WebElement proceedToCheckoutButton = browser.findElement(confirmationSelector);
        proceedToCheckoutButton.click();
    }
}
