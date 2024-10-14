package com.example.selenium_java.drivercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentWindowHandle=driver.getWindowHandle();
        System.out.println("Parent window handle:"+parentWindowHandle);
        System.out.println(driver.getCurrentUrl());


        driver.findElement(By.id("newTabBtn")).click();

        Set<String> windowHandles=driver.getWindowHandles();
        for(String windowHandle:windowHandles){
            System.out.println("After navigating to world wide web:" +windowHandle);
            if(!windowHandle.equals(parentWindowHandle)){
                driver.switchTo().window(windowHandle);
                driver.findElement(By.id("alertBox")).click();
                System.out.println("text in alert" +driver.switchTo().alert().getText());
                driver.switchTo().alert().accept();
                Thread.sleep(5000);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        Thread.sleep(3000);
        driver.quit();

    }
}
