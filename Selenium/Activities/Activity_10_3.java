//Activity_10_3
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://training-support.net/selenium/drag-drop
//Getting the title of the page using driver.getTitle() and print out the title.
//Finding the ball and simulate a click and drag to move it into "Dropzone 1".
//Verifying that the ball has entered Dropzone 1.
//Once verified, move the ball into "Dropzone 2".
//Verifying that the ball has entered Dropzone 2.
//Once verified, close the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity_10_3 {
    public static void main(String[] args) throws InterruptedException {
        // Declaring new WebDriver
        WebDriver driver = new FirefoxDriver();
        // Declaring new WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Navigatine to the activity page
        driver.get("https://training-support.net/selenium/drag-drop");
        // Waiting for the ball to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        // Saving different elements in variables
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        // Compiling a custom action for Drag/Drop and perform it.
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ball, drop1).build().perform();
        // Waiting for the Dropzone's color to change
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("ENTERED DROPZONE 1");
        // Repeating for the second dropzone
        dragAndDrop.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("ENTERED DROPZONE 2");
        // Closing the browser
        driver.close();
    }
}