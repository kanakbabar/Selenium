package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.actimind.com/");
//find the menu "About Company"

        WebElement menu = driver.findElement(By.linkText("AREAS OF EXPERTISE"));

//mouse hover on "About Company" menu
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
//click on submenu "Basic Facts"
        WebElement submenu = driver.findElement(By.xpath("//a[text()='Web Crawling']"));
        submenu.click();
    }
}
