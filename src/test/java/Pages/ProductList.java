package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductList extends BasePage{

    private By productWomanlListLocator = By.cssSelector("a.sf-with-ul");

    public ProductList(WebDriver browserDriver) {
        super(browserDriver);
    }

//    public void chooseProductWomanList() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(productWomanlListLocator));
//        WebElement womanLink = browser.findElement(productWomanlListLocator);
//        womanLink.click();
//    }
    //SecondProductPage
    public SecondProductPage chooseProductWomanList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productWomanlListLocator));
        WebElement womanLink = browser.findElement(productWomanlListLocator);
        womanLink.click();
        return new SecondProductPage(browser);
    }
}
