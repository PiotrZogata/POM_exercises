package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage extends BasePage{

    private By addToCartButtonLocator = By.xpath("//p[@id='add_to_cart']/button");

    public ProductDetailsPage(WebDriver browserDriver) {
        super(browserDriver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButtonLocator));
    }

//    public void clickAddToCartButton(){
//        wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonLocator));
//        WebElement addToCartButton = browser.findElement(addToCartButtonLocator);
//        addToCartButton.click();
//    }
    //AddToCartConfirmationPopup
public AddToCartConfirmationPopup clickAddToCartButton(){
    wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonLocator));
    WebElement addToCartButton = browser.findElement(addToCartButtonLocator);
    addToCartButton.click();
    return new AddToCartConfirmationPopup(browser);
}
}
