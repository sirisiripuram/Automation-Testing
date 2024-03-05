package co.edurekatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment2 {

    public static void main(String[] args) {
        // Setting up Chrome driver
        System.setProperty("webdriver.chrome.driver", "..\\Feb12Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launching Rediff.com
        driver.get("https://www.rediff.com");

        // Task 1: Inspect the "Money" element with different locators
        // A) Inspect with class locator
        WebElement moneyElementByClass = driver.findElement(By.className("moneyicon"));
        System.out.println("Money element found with class locator: " + moneyElementByClass.getText());

        // B) Inspect with XPath locator
        WebElement moneyElementByXPath = driver.findElement(By.xpath("//a[text()='Money']"));
        System.out.println("Money element found with XPath locator: " + moneyElementByXPath.getText());

        // C) Inspect with CSS locator
        WebElement moneyElementByCSS = driver.findElement(By.cssSelector("a[title='Live commentary of the Indian stock markets, stock quotes and business news']"));
        System.out.println("Money element found with CSS locator: " + moneyElementByCSS.getText());

        // Task 2: Inspect all the textboxes with different locators
        // A) Inspect with name locator
        List<WebElement> textboxesByName = driver.findElements(By.name("textbox_name"));
        for (WebElement textbox : textboxesByName) {
            System.out.println("Textbox found with name locator: " + textbox.getAttribute("name"));
        }

        // B) Inspect with id locator
        List<WebElement> textboxesById = driver.findElements(By.id("textbox_id"));
        for (WebElement textbox : textboxesById) {
            System.out.println("Textbox found with id locator: " + textbox.getAttribute("id"));
        }

        // Task 3: Inspect the mentioned elements
        // A) Rediffmail.com, enterprise email, videos, business email, shopping, sign in, and create an account
        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href,'rediffmail') or contains(@href,'enterprise') or contains(@href,'videos') or contains(@href,'business') or contains(@href,'shopping') or contains(text(),'Sign In') or contains(text(),'Create an Account')]"));
        for (WebElement element : elements) {
            System.out.println("Element found: " + element.getText());
        }

        // B) Inspect all the links present on Rediff.com
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println("Link found: " + link.getText());
        }

        // Task 4: Inspect the “sign in” link and click on it (Highlighted in red)
        WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));

        // Get the computed color of the "sign in" link using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String color = (String) js.executeScript("return window.getComputedStyle(arguments[0]).color", signInLink);

        // Verify if the color contains the value "red"
        if (color.toLowerCase().contains("red")) {
            System.out.println("The 'Sign In' link is displayed in red color.");
        } else {
            System.out.println("The 'Sign In' link is not displayed in red color.");
        }


        // Close the browser
        driver.quit();
    }
}
