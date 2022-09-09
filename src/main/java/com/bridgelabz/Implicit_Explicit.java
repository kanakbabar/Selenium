package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Implicit_Explicit {
      public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Say my name!']"))).click();

        Thread.sleep(1000);
        Alert alert = (Alert) driver.switchTo().alert();

        System.out.println("Alert text: " + ((Alert) alert).getText());

        Thread.sleep(1000);
        ((Alert) alert).sendKeys("Rahul");
        Thread.sleep(1000);
        ((Alert) alert).accept();
        Thread.sleep(1000);
        System.out.println("message after entering the name: " + ((Alert) alert).getText());

        ((Alert) alert).accept();

        Thread.sleep(3000);

        driver.quit();
    }
}


