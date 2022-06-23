//Activity_1
// Simple activity to show the boilerplate of every selenium script.
//Creating a Class with a main() method
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net
//Closing the browser with driver.close()

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the browser
        driver.get("https://www.training-support.net");
        // Close the browser
        driver.close();
    }
}