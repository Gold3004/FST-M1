//Activity_11_4
//Creating a Package with a Class and a main() method
//For this activity, import java.util.Set
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/tab-opener
//Printing the Page Title and Handle of that tab.
//Finding the button to open a new tab and click it.
//Waiting for the new tab to open.
//Printing all the handles.
//Switch to the newly opened tab, print it's title and heading.
//Repeating steps 6-8 by clicking the button on the new tab.
//Finally, closing both windows using quit().
//In this activity we use getWindowHandle() and getWindowHandles()
//getWindowHandle() - Returns a string value which is the Window handle of current focused browser window.
//getWindowHandles() - Returns a set of all Window handles of all the browsers that were opened in the session.
//We also use driver.switchTo().activeElement(). This switches focus to the window that was opened most recently.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;

public class Activity_11_4 {
    public static void main(String[] args) {
        // Creating a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Opening browser
        driver.get("https://www.training-support.net/selenium/tab-opener");
        //Printing title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());
        //Getting parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);
        //Finding link to open new tab and click it
        driver.findElement(By.linkText("Click Me!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //Get Window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
        //Looping through each handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        //Printing the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());
        //Waiting for page to load completely
        wait.until(ExpectedConditions.titleIs("Newtab"));
        //Printing New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
        //Getting heading on new page
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
        //Opening Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        //Making sure the new tab's handle is part of the handles set
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);
        //Looping through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        //Printing the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());
        //Waiting for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        //Printing New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
        //Getting heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
        //Closing the browser
        driver.quit();
    }
}