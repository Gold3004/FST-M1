//Activity 10-2
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening a browser with https://www.training-support.net/selenium/input-events
//Getting the title of the page using driver.getTitle() and printing out the title.
//Performing the following actions,
//Press the key of your first name in caps
//Press CTRL+a and the CTRL+c to copy all the text on the page.
//(Paste the text in a text editor to verify results.)
//Finally, closing the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        String pressedKeyText;
        //Opening browser
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));

        //Create action sequence for initials
        Action actionSequence1 = actions.sendKeys("S").build();
        actionSequence1.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        //Creating action sequence for Spacebar
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        //Closing browser
        driver.close();
    }
}