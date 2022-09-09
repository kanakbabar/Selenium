package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebook_Css
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(100);
        driver.manage().window().maximize();
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[.='Create New Account']")).click();
        Thread.sleep(100);
        driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("kanak");
        Thread.sleep(100);
       driver.findElement(By.xpath("//input[contains(@aria-label,'Surname')]")).sendKeys("babar");
        Thread.sleep(100);
       driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).sendKeys("kanakbabar999@gmail.com");
        Thread.sleep(100);
        driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("password");
    }
}
