package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;

public class ListBox_PrintDuplicate
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/KANAK/OneDrive/Desktop/Selenium/Selenium_1/src/test/java/listbox.html");
        WebElement listbox = driver.findElement(By.id("mtr"));
        Select s = new Select(listbox);
        List<WebElement> allOptions = s.getOptions();
        int count1 = allOptions.size();
        System.out.println("Number of elements in the list is :" +count1);
        HashSet<String> allElementText = new HashSet<String>();
        for (int i = 0; i < count1; i++) {
            String text = allOptions.get(i).getText();
/*allElementText.add(text) returns true if the element is not already
added, and it returns false if the same element is trying to be added
twice. */
            if (!allElementText.add(text)) {
                System.out.println(text +" is the duplicate item in the list box");
            }
        }
        System.out.println(allElementText.size());
        // it will print all the unique values in the HashSet object
        System.out.println(allElementText);
        driver.close();
    }
}
