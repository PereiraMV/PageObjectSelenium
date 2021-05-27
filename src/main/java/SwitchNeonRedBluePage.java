import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchNeonRedBluePage {

    WebDriver driver;
    public SwitchNeonRedBluePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isNintendoSwitchDisplayed(String expectedText){
        String displayedText = driver.findElement(By.id("productTitle")).getText();

        return displayedText.contains(expectedText) ;
    }
}
