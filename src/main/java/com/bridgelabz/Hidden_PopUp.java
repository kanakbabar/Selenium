package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_PopUp
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        //option.addArguments("--disable-geolocation");
       // option.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("24")).click();

    }
}
