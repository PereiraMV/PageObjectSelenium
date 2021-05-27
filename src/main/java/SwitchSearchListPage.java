import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchSearchListPage {

    WebDriver driver;
    public SwitchSearchListPage(WebDriver driver){
        this.driver = driver;
    }

    public SwitchNeonRedBluePage OpenSwitchNeonRedBluePage(){

        driver.findElement(By.cssSelector("[data-cel-widget='search_result_1'] span.a-size-base-plus")).click();
        return new SwitchNeonRedBluePage(driver);
    }

}
