package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu_1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.istqb.in/");
        WebElement foundation = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
        Actions actions = new Actions(driver);
//mouse hover on Foundation tab
        actions.moveToElement(foundation).perform();
        Thread.sleep(3000);
        WebElement enrollment = driver.findElement(By.xpath("(//span[text()='ENROLLMENT'])[1]"));
//mouse hover on Enrollment
        actions.moveToElement(enrollment).perform();
        Thread.sleep(3000);
        WebElement corporateEnrol = driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
//mouse hover on Corporate Enrollment
        actions.moveToElement(corporateEnrol).perform();
        Thread.sleep(3000);
//click on Corporate Enrollment
        driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
        driver.close();
    }
}
