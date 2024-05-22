package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartSummaryPage extends BasePage{

    private final By summaryProductsLocator = By.id("summary_products_quantity");

    public ShoppingCartSummaryPage(WebDriver browser) {
        super(browser);
        wait.until(ExpectedConditions.visibilityOfElementLocated(summaryProductsLocator));
    }

    public int getQuantity(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(summaryProductsLocator));
        String numProductsLabelText = browser.findElement(summaryProductsLocator).getText();
        int spaceLocation = numProductsLabelText.indexOf(" ");
        int numProducts = Integer.parseInt(numProductsLabelText.substring(0, spaceLocation));
        return numProducts;
    }

}
