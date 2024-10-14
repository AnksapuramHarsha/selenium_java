package com.example.selenium_java.drivercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCommands {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.findElement(By.xpath("//button[@onclick=\"showAlert()\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        /*
        driver.switchTo().alert().dismiss();   cancel
        driver.switchTo().alert().getText();   displays text from alert
        driver.switchTo().alert().sendKeys();   to enter text in alert
         */

    }
}
