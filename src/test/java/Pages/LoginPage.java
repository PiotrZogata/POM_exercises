package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("passwd");
    private By submitLoginLocator = By.id("SubmitLogin");

    public LoginPage(WebDriver browserDriver) {
        super(browserDriver);;
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
    }

    public void login(String email, String pass){
        enterEmail(email);
        enterPassword(pass);
        clickSignInButton();
    }

    private LoginPage enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        WebElement emailTextbox = browser.findElement(emailLocator);
        emailTextbox.clear();
        emailTextbox.sendKeys(email);
        return this;
    }

    private LoginPage enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        WebElement passwordTextbox = browser.findElement(passwordLocator);
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
        return this;
    }

    private HomePage clickSignInButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitLoginLocator));
        WebElement signInButton = browser.findElement(submitLoginLocator);
        signInButton.click();
        return new HomePage(browser);
    }
}
