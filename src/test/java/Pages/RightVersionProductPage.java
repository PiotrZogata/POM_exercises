package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RightVersionProductPage extends BasePage{

    private By rightProductLocator = By.cssSelector("#color_8");

    public RightVersionProductPage(WebDriver browserDriver) {
        super(browserDriver);
    }

//    public void chooseRightVersionOfProduct(){
//        //wait.until(ExpectedConditions.elementToBeClickable(By.id("#color_8")));
//        WebElement rightProduct = browser.findElement(rightProductLocator);
//        rightProduct.click();
//    }
    //ProductDetailsPage

    public ProductDetailsPage chooseRightVersionOfProduct(){
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("#color_8")));
        WebElement rightProduct = browser.findElement(rightProductLocator);
        rightProduct.click();
        return new ProductDetailsPage(browser);
    }
}
