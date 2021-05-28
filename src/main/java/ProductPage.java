import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;
    By TextDispayedSelector = By.id("productTitle");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public String getProductTitle(){

        String displayedText = driver.findElement(TextDispayedSelector).getText();

        return displayedText ;
    }
}
