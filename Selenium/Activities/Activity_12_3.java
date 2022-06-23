//Activity_12_3
//Navigating to https://www.training-support.net/selenium/popups
//Printing the title of the page.
//Finding the Sign-in button and hovering over it and Printing the tooltip message.
//Clicking the button to open the Sign-in form.
//Entering the credentials as
//username: admin
//password: password
//Clicking login and print the message on the page after logging in.
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions builder = new Actions(driver);
        //Opening browser
        driver.get("https://www.training-support.net/selenium/popups");
        //Finding Sign in button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        //Hovering over button
        builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
        //Clicking on the button
        button.click();
        //Waiting for modal to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        //Finding username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Reading the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        //Closing browser
        driver.close();
    }
}