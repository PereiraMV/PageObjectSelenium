import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;
    public static final String idTextDispayed = "productTitle";

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isNintendoSwitchContained(String expectedText){
        String displayedText = driver.findElement(By.id(idTextDispayed)).getText();

        return displayedText.contains(expectedText) ;
    }
}
