package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usedCarWebUITest {
    public static void main(String[] args) {
        // Sets up the Selenium driver to automate Chrome testing
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open TradeMe Sandbox
        String baseUrl = "https://www.tmsandbox.co.nz/motors/used-cars/nissan/auction-2149276142.htm";
        driver.get(baseUrl);

        // Set the variables we are testing
        boolean isNumberPlateFound = false;
        boolean isKilometersFound = false;
        boolean isBodyFound = false;
        boolean isSeatsFound = false;

        // Tests in here

        // Results of test
        if (isNumberPlateFound) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        if (isKilometersFound) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        if (isBodyFound) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        if (isSeatsFound) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        // Close any reference to driver
        driver.close();
    }
}
