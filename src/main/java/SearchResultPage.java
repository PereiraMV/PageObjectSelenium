import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;
    By firstSwitchSelector = By.cssSelector("[data-component-type='s-search-result']");
    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductPage OpenProductPage(){


        driver.findElements(firstSwitchSelector).get(0).click();
        return new ProductPage(driver);
    }

}
