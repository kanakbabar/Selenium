package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Switchto");
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.sendKeys("kanak");
        a.accept();
    }
}
