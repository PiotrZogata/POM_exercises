import Pages.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class POMCartTests {

    @Test
    public void POMAddToCartTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver24\\chromedriver-win64\\chromedriver.exe");

        // initialisation
        WebDriver browser = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(browser, 10);
        browser.manage().window().maximize();

        // go to website
        browser.get("http://www.automationpractice.pl/index.php?/");

        // navigate to signInPage
        SignInPage signInPage = new SignInPage(browser);
        signInPage.navigateToLoginPage()
                  .login("peterzo@test.com", "Password1234");

        // navigate back to home page
        HomePage homePage = new HomePage(browser);
        homePage.clickSignInButton()
                .chooseProductWomanList()
                .selectSecondProduct()
                .chooseRightVersionOfProduct()
                .clickAddToCartButton()
                .clickConfirmation();

        // verify we have 1 item in the shopping cart
        //assertEquals(numProducts, 1, "Expected number of products in shopping cart was 1 but actual value was: " + Integer.toString(numProducts));
        ShoppingCartSummaryPage summaryCart = new ShoppingCartSummaryPage(browser);
        int numProducts = summaryCart.getQuantity();
        assertEquals(numProducts, 1);

        browser.quit();
    }
}

