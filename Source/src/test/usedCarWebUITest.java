package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.List;

public class usedCarWebUITest {
    String baseUrl = "https://www.tmsandbox.co.nz/motors/used-cars/nissan/auction-2149276142.htm";
    public WebDriver driver;

    @BeforeTest
    public void setupTests() {
        // Sets up the Selenium driver to automate Chrome testing
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        // Open TradeMe Sandbox
        driver.get(baseUrl);
    }

    @Test
    public void testCarWebUI() {
        // Set the variables we are testing
        boolean isNumberPlateFound = false;
        boolean isKilometersFound = false;
        boolean isBodyFound = false;
        boolean isSeatsFound = false;

        // Tests in here
        List<WebElement> motorAtrributes = driver.findElements(By.className("motors-attribute-label"));
        for (WebElement attribute : motorAtrributes) {
            switch (attribute.getText()) {
                case "Number plate":
                    isNumberPlateFound = true;
                    break;
                case "Kilometres":
                    isKilometersFound = true;
                    break;
                case "Body":
                    isBodyFound = true;
                    break;
                case "Seats":
                    isSeatsFound = true;
                    break;
            }
        }

        // Results of test
        Assert.assertEquals(isNumberPlateFound, true);
        Assert.assertEquals(isKilometersFound, true);
        Assert.assertEquals(isBodyFound, true);
        Assert.assertEquals(isSeatsFound, true);
    }

    @AfterTest
    public void closeTest() {
        // Close any reference to driver
        driver.close();
    }
}
