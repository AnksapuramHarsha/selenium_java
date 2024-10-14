package com.example.selenium_java.drivercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommandsInSel {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        String url="https://www.economist.com/";
//        driver.get(url);
//
//        String titleName=driver.getTitle();
//        System.out.println(titleName);
//        System.out.println(titleName.length());
//
//        String currentUrl=driver.getCurrentUrl();
////        verifying current url with base url
//        if(currentUrl.equals(url)){
//            System.out.println(currentUrl);
//        } else{
//            System.out.println("url mismatch");
//        }

//        String getPageSource= driver.getPageSource();
//        System.out.println(getPageSource+" "+getPageSource.length());
//        driver.quit();


//        -------------------------------------------------------
//                Navigate Commands
//        --------------------------------------------------------
//        driver.navigate().to("https://www.facebook.com/");//same as get(url) method
//        driver.findElement(By.linkText("Create a Page")).click();
//        driver.navigate().back();
//        driver.navigate().forward();
//        System.out.println(driver.getCurrentUrl());
//        driver.navigate().refresh();
//        driver.quit();


    }
}
