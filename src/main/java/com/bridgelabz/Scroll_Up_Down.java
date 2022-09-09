package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.org/download");
//typecasting driver object to JavascriptExecutor interface type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
//scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
//scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
    }
}