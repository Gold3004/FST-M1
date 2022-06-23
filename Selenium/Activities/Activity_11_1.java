import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Activity_11_1
//Creating a Class and a main() method
//For this activity import the following classes
//org.openqa.selenium.support.ui.Alert
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/javascript-alerts
//Getting the title of the page using driver.getTitle() and print out the title.
//Using findElement() to find the button to open a SIMPLE alert and click it.
//Switch the focus from the main window to the Alert box and get the text in it and print it.
//Finally, close the alert with alert.accept() and close() the browser
//Using Alert interface methods to deal with the alert of the org.openqa.selenium.Alert package.
//accept() - To accept the alert. Same as clicking "OK"
//dismiss() - To dismiss the alert. Same as clicking "Cancel"
//getText() - To get the text of the alert
//sendKeys() -To write some text to the alert
//To switch focus to the alert box, use driver.switchTo().alert()
public class Activity_11_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Clicking the button to open a simple alert
        driver.findElement(By.cssSelector("button#simple")).click();
        //Switch to alert window
        Alert simpleAlert = driver.switchTo().alert();
        //Getting text in the alert box and print it
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is: " + alertText);
        //Closing the alert box
        simpleAlert.accept();
        //Closing the Browser
        driver.close();
    }
}