package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("C:/Users/KANAK/OneDrive/Desktop/Selenium/Selenium_1/src/test/java/listbox.html");
        WebElement list = driver.findElement(By.id("mtr"));
//Create an object of Select class and pass the address of list box as an argument
        Select s = new Select(list);
//getOptions() method returns a list of all the elements of the list box
        List<WebElement> options = s.getOptions();
        int s1 = options.size();
        System.out.println("Number of elements present inside the listbox is : " + s1);
//Print all the elements present in the list box
        for (WebElement webElement : options) {
            String text = webElement.getText();
            System.out.println(text);
        }
//selectByIndex() selects an element based on the Index, here index starts with 0
        s.selectByIndex(0);
//selectByValue() method selects an element based on its value attribute.
        s.selectByValue("v");
/*selectByVisibleText() method selects an element based on the actual text that is visible to the
user. For instance, if there are multiple Poori present inside the listbox , it will select all the
Poori elements.*/
        s.selectByVisibleText("Poori");
        System.out.println("************Print all selected options***********");
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
        System.out.println("Number of items that is selected in the list box is : " + size2);
        System.out.println(" Selected items are printed below ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }
        System.out.println("check whether it is a multiple select listbox or not");
        boolean multiple = s.isMultiple();
        System.out.println(multiple + " yes , it is multi select");
        if (multiple) {
//Print the first selected option in the list box
            WebElement firstSelectedOption = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText() + " is the first selected item in the list box");
//deselect the item present in 0th index.
            s.deselectByIndex(0);
//Print the first selected option in the list box
            WebElement firstSelectedOption1 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption1.getText() + " is the first selected item");
//deselect an item which has an attribute called value and its value is "v"
            s.deselectByValue("v");
//Print the first selected option in the list box
            WebElement firstSelectedOption2 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption2.getText() + " is the first selected item");
            s.deselectByVisibleText("Poori");
        }
    }
}