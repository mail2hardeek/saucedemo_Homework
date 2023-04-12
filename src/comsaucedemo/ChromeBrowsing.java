package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowsing {
    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/"; //Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(url); // Open URL
        System.out.println("Tittle: " + driver.getTitle()); // Print the title of the page
        System.out.println("Current URL: " + driver.getCurrentUrl()); //Print the current url
        System.out.println("Page Source: " + driver.getPageSource()); // Print the page source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Time out
        WebElement username = driver.findElement(By.id("user-name")); //Enter the email to email field
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password")); //Enter the password to password field
        password.sendKeys("secret_sauce");

        driver.close(); //Close the browser
    }
}
