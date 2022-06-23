//Activity 9-1 - Dropdown values
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening the browser with https://training-support.net/selenium/selects using the get() method.
//Using findElement() to find the dropdown WebElement on the page.
//Creating a new Select class object with the WebElement.
//On the dropdown, Selecting the second option using selectByVisibleText()
//Selecting the third option using selectByIndex()
//Selecting the fourth option using selectByValue()
//Finally, get all the options in the dropdown and printing them one by one

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Activity_9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://training-support.net/selenium/selects");
        //Chosing option
        WebElement chosen = driver.findElement(By.id("single-value"));
        //Finding dropdown
        Select dropdown = new Select(driver.findElement(By.id("single-select")));
        //Selecting second option by visible text
        dropdown.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());
        //Selecting third option by index
        dropdown.selectByIndex(3);
        System.out.println(chosen.getText());
        //Selecting fourth option by value
        dropdown.selectByValue("4");
        System.out.println(chosen.getText());
        //Getting all options
        List<WebElement> options = dropdown.getOptions();
        //Printing them
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
        //Closing browser
        driver.close();
    }
}