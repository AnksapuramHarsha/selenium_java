package com.example.selenium_java.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitAndExplicitWaitMethods {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/");
        WebElement ele=driver.findElement(By.linkText("Dynamic Loading"));
        ele.click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();

        driver.findElement(By.xpath("//button[contains(text(),Start)]")).click();

        // Create a WebDriverWait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement helloEle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
        if(helloEle.getText().equals("Hello World!")){
            System.out.println("validated");
        }else{
            System.out.println("not validated");
        }
        driver.quit();

    }
}
