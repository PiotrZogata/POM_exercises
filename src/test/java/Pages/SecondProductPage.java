package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SecondProductPage extends BasePage{

    private By productLinksLocator = By.cssSelector("a.product-name");

    public SecondProductPage(WebDriver browserDriver) {
        super(browserDriver);
    }

    public void selectProduct(int productIndex){
        List<WebElement> productLinks = getProductNameLinks();
        productLinks.get(productIndex).click();
    }

    public RightVersionProductPage selectSecondProduct(){
        selectProduct(2);
        return new RightVersionProductPage(browser);
    }

    public List<WebElement> getProductNameLinks() {
        List<WebElement> productLinks = browser.findElements(productLinksLocator);
        wait.until(ExpectedConditions.elementToBeClickable(productLinks.get(2)));
        return productLinks;
    }
}
