package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By homeLinkLocator = By.cssSelector("i.icon-home");

    public HomePage(WebDriver browserDriver) {
        super(browserDriver);;
        //wait.until(ExpectedConditions.visibilityOfElementLocated(homeLinkLocator));
    }

    public ProductList clickSignInButton(){
        //wait.until(ExpectedConditions.elementToBeClickable(homeLinkLocator));
        WebElement homeLink = browser.findElement(homeLinkLocator);
        homeLink.click();
        return new ProductList(browser);
    }
}
