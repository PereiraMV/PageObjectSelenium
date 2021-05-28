import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;
    By firstSwitchSelector = By.cssSelector("[data-component-type='s-search-result']");
    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public ProductPage OpenProductPage(int index){


        driver.findElements(firstSwitchSelector).get(index).click();
        return new ProductPage(driver);
    }

}