//Activity_6_2
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/ajax
//Getting the title of the page using driver.getTitle() and print out the title.
//Finding and click the "Change content" button on the page.
//Waiting for the text to say "HELLO!". Print the message that appears on the page.
//Waiting for the text to change to contain "I'm late!". Print the new message on the page.
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity_6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Opening browser
        driver.get("https://training-support.net/selenium/ajax");
        //Finding and click the button
        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
        //Waiting for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        //getText() and printing it
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);
        //Waiting for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        //Getting late text and printing it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);
        //Closing browser
        driver.close();
    }
}