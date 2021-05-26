package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usedCarWebUITest {
    public static void main(String[] args) {
        // Sets up the Selenium driver to automate Chrome testing
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open TradeMe Sandbox
        String baseUrl = "https://www.tmsandbox.co.nz/";
        driver.get(baseUrl);

        // Really basic test to see if se
        System.out.println("Title:"+driver.getTitle());

        // Close any reference to driver
        driver.close();
    }
}
