package assignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        // Initialize FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "..\\Feb12Automation\\Drivers\\geckodriver.exe");
    }

    @BeforeClass
    public void beforeClass() {
        // Initialize FirefoxDriver
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void setUp() {
        // No additional setup needed
    }

    @Test
    public void method() {
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        wait.until(ExpectedConditions.titleContains("Facebook"));
        // Perform actions after wait
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("example@example.com");
    }

    @Test
    public void method2() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(50000); // Sleep for 50 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
    }

    @Test
    public void method3() {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, java.util.concurrent.TimeUnit.SECONDS); // Implicit wait for 60 seconds
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.MINUTES); // Implicit wait for 10 minutes
        driver.manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.HOURS); // Implicit wait for 1 hour
    }

    @AfterMethod
    public void tearDown() {
        // No additional teardown needed
    }

    @AfterClass
    public void afterClass() {
        // Close the browser
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        // No additional actions needed
    }
}
