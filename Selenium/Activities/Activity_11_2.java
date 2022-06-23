//Activity_11_2
//Creating a Class and a main() method
//For this activity import the following classes
//org.openqa.selenium.support.ui.Alert
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/javascript-alerts
//Getting the title of the page using driver.getTitle() and print out the title.
//Using findElement() to find the button to open a CONFIRM alert and click it.
//Switch the focus from the main window to the Alert box and get the text in it and print it.
//Closing the alert once with alert.accept() and again with alert.dismiss()
//Finally, close() the browser.

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Clicking the button to open a simple alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        //Getting text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
        //Closing the alert with OK
        confirmAlert.accept();
        //Closing the browser with Cancel
        //confirmAlert.dismiss();
        //Closing the Browser
        driver.close();
    }
}