package com.example.selenium_java.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsInSel {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        By id
//        driver.findElement(By.id("email")).sendKeys("Harsha");

//        By class name
//        driver.findElement(By.className("inputtext")).sendKeys("Harsha");

//        By name     -multiple ele with same name-> 1st ele is selected
//        driver.findElement(By.name("email")).sendKeys("harsha");

//        By linktext->works on links-> if they are multiple 1st ele is selected
//        driver.findElement(By.linkText("Forgotten password?")).click();

//        By partiallinktext
//        driver.findElement(By.partialLinkText("Forgotten")).click();

//        By tagname->to get a list of tag elements
//        List<WebElement> ele=driver.findElements(By.tagName("a"));
//        System.out.println(ele.size());
//        for(WebElement i:ele){
//            System.out.println(i.getText());
//        }

//        By css selectors
//        driver.findElement(By.cssSelector("#email")).sendKeys("Harsha");
//        driver.findElement(By.cssSelector(".inputtext._55r1")).sendKeys("Harsha");

//        xpath:
//            absolute xpath: /tagName[@attribute='value']
//              relative xpath: //tagName[@attribute='value']
//        driver.findElement(By.xpath("//input[@name=\"email\"][@id=\"email\"]")).sendKeys("vardhan");
//        driver.findElement(By.xpath("//*[@name=\"email\"][@id=\"email\"]")).sendKeys("vardhan");
//    USING CONTAINS() METHOD: //*[contains(@attribute,'attribute value')]
//        Ex: <button class="btn">click me</button>
//            <button class="btn">upload</button>
//            //*[contains(text(),'upload')]



    }
}
