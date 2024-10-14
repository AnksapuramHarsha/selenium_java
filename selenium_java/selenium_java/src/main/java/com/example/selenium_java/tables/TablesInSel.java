package com.example.selenium_java.tables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesInSel {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement ele=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        ele.sendKeys("points table world cup 2023");
        ele.sendKeys(Keys.ENTER);


        /*

          driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
          WebElement table=driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]"));
          List<WebElement> headerElements=table.findElements(By.xpath("//table/thead/tr/th"));
            System.out.println(headerElements.size());
            for(WebElement ele:headerElements){
                System.out.println(ele.getText());
            }
            //Getting all rows
        List<WebElement> rowElements=table.findElements(By.xpath("//table//tr"));
        for(WebElement ele:rowElements){
            System.out.println(ele.getText());
        }
        Second row fifth colm
        WebElement ele=driver.findElement(By.xpath("//table//tr[2]/td[5]"));
        System.out.println("Salary is:" +ele.getText());

*/

        driver.findElement(By.xpath("//span[@jsname=\"JcdYse\"]")).click();

    }
}
