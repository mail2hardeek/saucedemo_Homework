package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultiBrowsing {
    static String browser = "Fire Fox"; // Set up the browser
    static WebDriver driv; // defining the variable to store the b
    static String Url = "https://www.saucedemo.com/";  //Open URL
    public static void main(String[] args) { // Main method
        if (browser.equalsIgnoreCase("Chrome")) { // Conditions applied for which browser to open
            driv = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Safari")) { // Conditions applied for which browser to open
            driv = new SafariDriver();
        } else if (browser.equalsIgnoreCase("Fire Fox")) { // Conditions applied for which browser to open
            driv = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) { // Conditions applied for which browser to open
            driv = new EdgeDriver();
        } else {
            System.out.println("Browser not found"); //Print the statement if browser is not found
        }
        driv.get(Url); ////Calling the url
        driv.manage().window().fullscreen(); //// full screen
        System.out.println("Tittle : " + driv.getTitle()); //Print the title of the page
        System.out.println("Current URL : " + driv.getCurrentUrl()); //Print the current URL of the page
        System.out.println("Page Source : " + driv.getPageSource()); ////Print the page source
        WebElement username = driv.findElement(By.id("user-name")); ////Enter the username to username field
        username.sendKeys("locked_out_user");
        WebElement password = driv.findElement(By.id("password")); //Enter the password to password field
        password.sendKeys("secret_sauce");
        driv.close(); //Browser closed
    }
}
