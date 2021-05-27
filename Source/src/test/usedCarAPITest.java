package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Goes through the Nissan cars API call and checks if it has the desired attributes
 */
public class usedCarAPITest {
    String baseUrl = "https://api.trademe.co.nz/v1/Categories/0001-0268-0316-/Details.XML";
    public WebDriver driver;
    public ArrayList<String> descriptionElements;

    @BeforeTest
    public void setupTests() {
        // Sets up the Selenium driver to automate Chrome testing
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        // Open TradeMe Sandbox
        driver.get(baseUrl);

        // Get the elements
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String body = bodyElement.getText();

        // VVV Tried to parse as an XML document but had issues so had to iterate and VVV
        //     check as a String, which I know is a bit smelly

        // Create a regex pattern to only take info in between description tags
        String pattern1 = "<Attribute>\n<Name>";
        String pattern2 = "</Name>";
        String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);
        Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(body);

        descriptionElements = new ArrayList<>();
        while (matcher.find()) {
            descriptionElements.add(matcher.group(1));
        }
    }

    @Test
    public void areThereNumberPlateDetails() {
        // Set the variables we are testing
        boolean isNumberPlate = false;

        // Check the list to see if St Johns exists
        for (String element : descriptionElements) {
            if (element.equals("NumberPlate")) {
                isNumberPlate = true;
            }
        }

        // Results of test
        Assert.assertEquals(isNumberPlate, true);
    }

    @Test
    public void areThereKilometeresDetails() {
        // Set the variables we are testing
        boolean isKilometersFound = false;

        // Check the list to see if St Johns exists
        for (String element : descriptionElements) {
            if (element.equals("Kilometres")) {
                isKilometersFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isKilometersFound, true);
    }

    @Test
    public void areThereBodyDetails() {
        // Set the variables we are testing
        boolean isBodyFound = false;

        // Check the list to see if St Johns exists
        for (String element : descriptionElements) {
            if (element.equals("BodyStyle")) {
                isBodyFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isBodyFound, true);
    }

    @Test
    public void areThereSeatDetails() {
        // Set the variables we are testing
        boolean isSeatsFound = false;

        // Check the list to see if St Johns exists
        for (String element : descriptionElements) {
            if (element.equals("Seats")) {
                isSeatsFound = true;
            }
        }

        // Results of test
        Assert.assertEquals(isSeatsFound, true);
    }

    @AfterTest
    public void closeTest() {
        // Close any reference to driver
        driver.close();
    }
}
