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

/**
 * Goes through the 2017 Nissan Navara Warrior 4x4 and check if it has the desired attributes
 */
public class usedCarWebUITest {
    public String baseUrl = "https://www.tmsandbox.co.nz/motors/used-cars/nissan/auction-2149276142.htm";
    public WebDriver driver;
    public List<WebElement> motorAtrributes;

    @BeforeTest
    public void setupTests() {
        // Sets up the Selenium driver to automate Chrome testing
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        // Open TradeMe Sandbox
        driver.get(baseUrl);

        // Set up the attributes for each test
        motorAtrributes = driver.findElements(By.className("motors-attribute-label"));
    }

    @Test
    public void areThereNumberPlateDetails() {
        // Set the variable we are testing
        boolean isNumberPlateFound = false;

        // Iterate through the attributes for element
        for (WebElement attribute : motorAtrributes) {
            if(attribute.getText().equals("Number plate")) {
                isNumberPlateFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isNumberPlateFound, true, "Contains Number Plate Information");
    }

    @Test
    public void areThereKilometerDetails() {
        // Set the variable we are testing
        boolean isKilometersFound = false;

        // Iterate through the attributes for element
        for (WebElement attribute : motorAtrributes) {
            if(attribute.getText().equals("Kilometres")) {
                isKilometersFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isKilometersFound, true, "Contains Kilometers Information");
    }

    @Test
    public void areThereBodyDetails() {
        // Set the variable we are testing
        boolean isBodyFound = false;

        // Iterate through the attributes for element
        for (WebElement attribute : motorAtrributes) {
            if(attribute.getText().equals("Body")) {
                isBodyFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isBodyFound, true, "Contains Body Information");
    }

    @Test
    public void areThereSeatsDetails() {
        // Set the variable we are testing
        boolean isSeatsFound = false;

        // Iterate through the attributes for element
        for (WebElement attribute : motorAtrributes) {
            if(attribute.getText().equals("Seats")) {
                isSeatsFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isSeatsFound, true, "Contains Seats Information");
    }

    @AfterTest
    public void closeTest() {
        // Close any reference to driver
        driver.close();
    }
}
