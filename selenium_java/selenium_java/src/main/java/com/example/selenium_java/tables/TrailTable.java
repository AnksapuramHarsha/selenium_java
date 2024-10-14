package com.example.selenium_java.tables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TrailTable {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement ele = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        ele.sendKeys("points table world cup 2023");
        ele.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@jsname='JcdYse']")).click();
//        List<WebElement> tables=driver.findElements(By.xpath("//table[@class='Jzru1c']"));
        List<WebElement> table=driver.findElements(By.xpath("//div[@data-unq-id='tab-1-3']//table[@class='Jzru1c']"));


    }
}
