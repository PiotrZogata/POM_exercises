package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver browser;
    WebDriverWait wait;

    public BasePage(WebDriver browserDriver) {
        this.browser = browserDriver;
        wait = new WebDriverWait(browser, 10);
    }
}
