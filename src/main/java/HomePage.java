import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage enterTextSearchBar(String text){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(text);
        return this;
    }
    public SwitchSearchListPage OpenSwitchSearchListPage(){

        driver.findElement(By.id("nav-search-submit-button")).click();
        return new SwitchSearchListPage(driver);
    }

}
