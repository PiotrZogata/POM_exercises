package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {


    By signInButton = By.cssSelector("a.login");

    public SignInPage(WebDriver browserDriver) {
        super(browserDriver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(homeLinkLocator));
    }

    public LoginPage navigateToLoginPage() {
        WebElement signInLink = browser.findElement(signInButton);
        signInLink.click();
        return new LoginPage(browser);
    }
}
