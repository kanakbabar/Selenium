package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_fb
{
    public static void main(String[] args) throws InterruptedException {
        // Launch Chrome browser
        System.setProperty("webdriver.chrome.driver","C:/Users/KANAK/OneDrive/Desktop/Selenium/chromedriver.exe");

        // Create object of web driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("9890744829");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("kan@12");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);

    }
}
