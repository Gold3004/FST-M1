//Activity 9-2 -- Multi-Select
//Creating a WebDriver instance, named driver, with the FirefoxDriver().
//Opening the browser with https://training-support.net/selenium/selects using the get() method.
//Using findElement() to find the multi-select WebElement on the page.
//Creating a new Select class object with the WebElement.
//Checking if the HTML element is a multi-list. Proceed with other actions if it is.
//Selecting the 'JavaScript' option by visible text.
//Selecting the 'NodeJS' option by value.
//Selecting the 4th, 5th, and the 6th options by index.
//Deselecting the 'NodeJS' option by value attribute.
//Deselecting the 7th option by index.
//Printing the first selected option.
//Printing all selected options one by one and deselect all options.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Activity_9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Opening browser
        driver.get("https://training-support.net/selenium/selects");
        //Chosen option
        WebElement chosen = driver.findElement(By.id("multi-value"));
        //Find multiList
        Select multiList = new Select(driver.findElement(By.id("multi-select")));
        if(multiList.isMultiple()) {
            //Selecting 'JavaScript' by Visible text
            multiList.selectByVisibleText("Javascript");
            System.out.println(chosen.getText());
            //Selecting 'NodeJS' by value
            multiList.selectByValue("node");
            System.out.println(chosen.getText());
            //Selecting 4,5, and 6 options by index
            for(int i=4; i<=6; i++) {
                multiList.selectByIndex(i);
            }
            System.out.println(chosen.getText());
            //Deselecting 'NodeJS' by value
            multiList.deselectByValue("node");
            System.out.println(chosen.getText());
            //Deselecting 7th opttion by index
            multiList.deselectByIndex(7);
            System.out.println(chosen.getText());
            //Getting all selected options
            List<WebElement> selectedOptions = multiList.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            //Deselecting all options
            multiList.deselectAll();
            System.out.println(chosen.getText());
        }
        //Closing browser
        driver.close();
    }
}
