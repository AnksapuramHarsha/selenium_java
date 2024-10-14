package com.example.selenium_java.frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("Nested Frames")).click();


        WebElement frameEle= driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));

        driver.switchTo().frame(frameEle);


        driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        WebElement frameLeft=driver.findElement(By.tagName("body"));
        System.out.println(frameLeft.getText());


        driver.switchTo().defaultContent();
        WebElement frameEle2= driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
        driver.switchTo().frame(frameEle2);

        WebElement framebottom=driver.findElement(By.tagName("body"));
        System.out.println(framebottom.getText());


    }
}
