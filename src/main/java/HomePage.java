import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By ResearchBarSelector = By.id("twotabsearchtextbox");
    By ButtonSearchSelector = By.id("nav-search-submit-button");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public SearchResultPage search(String text){
        driver.findElement(ResearchBarSelector).sendKeys(text);
        driver.findElement(ButtonSearchSelector).click();
        return new SearchResultPage(driver);
    }

}
