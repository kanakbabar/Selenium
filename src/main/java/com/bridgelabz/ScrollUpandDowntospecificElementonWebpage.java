package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDowntospecificElementonWebpage
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement ele = driver.findElement(By.xpath("//a[contains(.,'Due Date Calculator')]"));
        js.executeScript("arguments[0].scrollIntoView();",ele);



    }
}


