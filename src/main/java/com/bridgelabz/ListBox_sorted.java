package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBox_sorted
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.get("C:/Users/KANAK/OneDrive/Desktop/Selenium/Selenium_1/src/test/java/listbox.html");
            WebElement listElement = driver.findElement(By.id("mtr"));
            Select s = new Select(listElement);
            List<WebElement> allOptions = s.getOptions();
            int count = allOptions.size();
            System.out.println(count);
            System.out.println("-----print the values in the list ----");
            ArrayList<String> list = new ArrayList<String>();
            for (WebElement option : allOptions) {
                String text = option.getText();
                System.out.println(text);
                list.add(text);
            }
            Collections.sort(list);
            System.out.println("-----print the value in sorted order----");
            for (String value : list) {
                System.out.println(value);
    }
}
}