//Activity_6_1
//Creating a Class and a main() method
//For this activity importing the following classes
//org.openqa.selenium.support.ui.ExpectedConditions
//org.openqa.selenium.support.ui.WebDriverWait
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/dynamic-controls
//Getting the title of the page using driver.getTitle() and print out the title.
//Finding the checkbox toggle button and click it.
//Waiting till the checkbox disappears.
//Clicking the button again. Wait till it appears and check the checkbox.
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity_6_1 {
        public static void main(String[] args) {
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //Opening browser
            driver.get("https://training-support.net/selenium/dynamic-controls");
            //Finding checkbox and toggle button
            WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
            WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
            //Clicking the toggle button
            toggleCheckboxButton.click();
            //Waiting for checkbox to disappear
            wait.until(ExpectedConditions.invisibilityOf(checkbox));
            //Clicking toggle button again
            toggleCheckboxButton.click();
            //Waiting for checkbox to appear
            wait.until(ExpectedConditions.visibilityOf(checkbox));
            checkbox.click();
            //Closing browser
            driver.close();
        }
}
