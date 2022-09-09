package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Runner
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
        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("kanak");
        Thread.sleep(2000);


        driver.findElement(By.name("lastname")).sendKeys("babar");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("kanak999@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kanak999@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("1233456");
        Thread.sleep(2000);
        WebElement dateElement= driver.findElement(By.name("birthday_day"));
        Thread.sleep(2000);
        WebElement monthElement = driver.findElement(By.name("birthday_month"));
        Thread.sleep(2000);
        WebElement yearElement = driver.findElement(By.name("birthday_year"));
        Thread.sleep(2000);

        Select d_Dropdown = new Select(dateElement);
        Select m_Dropdown = new Select(monthElement);
        Select y_Dropdown = new Select(yearElement);

        d_Dropdown.selectByVisibleText("28");

        m_Dropdown.selectByVisibleText("Nov");

        y_Dropdown.selectByVisibleText("2000");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
    }
}
