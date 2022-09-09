package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:/Users/KANAK/OneDrive/Desktop/Selenium/Selenium_1/src/test/java/Page3.html");


       //using index of the frame - [ int value] [ index of frames starts with zero]
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("a");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("a");
        Thread.sleep(2000);


       /*//using id attribute of the frame -string
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("b");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("b");
        Thread.sleep(2000);


       //using name attribute of the frame -string
        driver.switchTo().frame("n1");
        driver.findElement(By.id("t1")).sendKeys("c");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("c");
        Thread.sleep(2000);

        
       //using address of the frame -webelement
        WebElement f = driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t1")).sendKeys("d");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("d");
        Thread.sleep(2000);*/
        driver.close();
    }
}
