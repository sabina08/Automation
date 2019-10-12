package day7_selenium_0914;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Library {

    //hovering over an element using mouse Actions
    public static void mouseHover(WebDriver driver,String locator, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        Actions mouseMove = new Actions(driver);
        try{
            System.out.println("Hovering to element " + elementName);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            mouseMove.moveToElement(element).perform();
        } catch (Exception err) {
            System.out.println("Unable to hover to element " + elementName + " --" + err);
        }
    }//end of mouse hover method

    //click on element using explicit wait
    public static void click(WebDriver driver,String locator, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            System.out.println("Clicking on element " + elementName);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).click();
        } catch (Exception err) {
            System.out.println("Unable to click on element " + elementName + " --" + err);
        }
    }//end of click method

    //entering info on element using explicit wait
    public static void userInput(WebDriver driver,String locator, String userValue, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            System.out.println("Entering value on element " + elementName);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).sendKeys(userValue);
        } catch (Exception err) {
            System.out.println("Unable to enter value on element " + elementName + " --" + err);
        }
    }//end of sendKeys method

    public static String captureText(WebDriver driver,String locator, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        String text = null;
        try{
            System.out.println("Capturing text on element " + elementName);
            text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).getText();
        } catch (Exception err) {
            System.out.println("Unable to capture text on element " + elementName + " --" + err);
        }

        return text;
    }//end of getText method





}//end of class
