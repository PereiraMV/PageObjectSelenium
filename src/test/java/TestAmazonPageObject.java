import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonPageObject {

    WebDriver driver;
    @BeforeMethod
    public void ouvrirChrome(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");

        String acceptCookiesXpath = "sp-cc-accept";
        WebElement cookiesButton = driver.findElement(By.id(acceptCookiesXpath));
        cookiesButton.click();
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void fermerChrome(){
        driver.quit();
    }


    @Test
    public void testAchatNintendoSwitch(){

        //Arrange
        String research, expectedResult;
        expectedResult = research = "Nintendo Switch";
        //Act
        HomePage homePage = new HomePage(driver);
        boolean result = homePage
                .enterTextSearchBar(research)
                .OpenSearchResultPage()
                .OpenProductPage()
                .isNintendoSwitchContained(expectedResult);

        //Assert

        Assert.assertTrue(result, "The message "+ expectedResult + " was not found in the title");

    }

}
