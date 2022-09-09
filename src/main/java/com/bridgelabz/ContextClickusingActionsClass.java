package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClickusingActionsClass
{
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        // action class object -
        Actions a = new Actions(driver);
        a.contextClick(button).perform();


    }
}
