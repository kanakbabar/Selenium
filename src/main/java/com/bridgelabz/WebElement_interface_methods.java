package com.bridgelabz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.devtools.v85.log.Log.clear;

public class WebElement_interface_methods
{
    public static void main(String[] args) throws InterruptedException {
       // 1] 1. getLocation() - is a method of webelement interface which is used to get the position
        //                       of an element on the webpage

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement XCE = driver.findElement(By.id("email"));
        int xu = XCE.getLocation().getX();                              // also use getY();
        System.out.println("X co-ordinate of username :" + xu);
        WebElement XCP = driver.findElement(By.id("passContainer"));
        int xp = XCP.getLocation().getX();
        System.out.println("X co-ordinate of password :" + xp);
        if (xu == xp) {
            System.out.println("Username and password text box are aligned proper");
        } else {
            System.out.println("Username and password text box are NOT aligned proper");
        }




        /*// 2] getSize() -  it returns an instance of Dimension class.
        //                 Dimension class has few methods like getHeight(), getWidth()

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement XCE = driver.findElement(By.id("email"));
        int xu = XCE.getSize().getHeight();                             // getwidth(); height()
        System.out.println("height of username :" + xu);
        WebElement XCP = driver.findElement(By.id("passContainer"));
        int xp = XCP.getSize().getHeight();
        System.out.println("height of password :" + xp);
        if (xu == xp) {
            System.out.println("Username and password text box are aligned proper");
        } else {
            System.out.println("Username and password text box are NOT aligned proper");
        }*/



       /* // 3] isDisplayed() - is a method of webelement interface which is used to check whether an
        //                  element is displayed or not on the webpage.  return type is boolean.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Boolean display = driver.findElement(By.id("pass")).isDisplayed();
        System.out.println("dispaly element or not on web page :" + display);*/




       /* // 4] isEnabled() - is a method of webelement interface which is used to check whether an
        //                    element is ENABLED or not on the webpage.return type is boolean.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Boolean display = driver.findElement(By.id("pass")).isEnabled();
        System.out.println("enable element or not on web page :" + display);*/



        /*// 5] isSelected - is a method of webelement interface which is used to check whether an
        //             element is Selected or not on the webpage. return type is boolean.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Boolean display = driver.findElement(By.id("pass")).isSelected();
        System.out.println("able to select the element or not on web page :" + display);*/



       /* // 6] sendKeys() - user able to enter value in field

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("kanak");*/



       /* // 7] clear() - clear the written value in field

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement clr = driver.findElement(By.id("email"));
        clr.sendKeys("kanak999@gmail.com");
        Thread.sleep(2000);
        clr.clear();*/


// not solve
       /* // 8]getAttribute(String) - is a method of webelement interface which returns the value of the
        //                         specified attribute in the form of string

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement clr = driver.findElement(By.id("email"));
        int value = Integer.parseInt(clr.getAttribute("placeholder"));
        System.out.println(value);*/



       /* // 9] getText() - is a method of webelement interface which returns the text of an element in the form of string
        //               and hence the return type is String

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.navigate().to("https://www.saucedemo.com/inventory-item.html?id=4");
        String path = "//div[contains(@class,'inventory_details_desc_container')]";
        String version = driver.findElement(By.xpath(path)).getText();
        System.out.println("Text on page : " + version);*/



       /* // 10] getTagname - return tag name of element in string format

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String clr = driver.findElement(By.id("email")).getTagName();
        System.out.println("tagename of element : " + clr);
        if (clr.equals("a")) {
            System.out.println("View LIcence is a link");
        } else{
            System.out.println("View LIcence is NOT a link");
        }*/


        /* // 11] click - is a method of webelement interface which is used to click on any element.
        //               does not return anything

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();*/


        /*// 12] submit - is a method of webelement interface which is used to click on any element.
        // it work only wehen type is submit
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.vtiger.com");
        String xp = "//button[.='Sign in']";
        driver.findElement(By.xpath(xp)).click();
        driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(xp)).submit();*/

// not solve
        /*// 13] getCssValue - it returns the value of the specified style related attribute in the form of strings

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String clr = String.valueOf(driver.findElement(By.id("//input[@id='email']")));
        String x=clr.getCssValue("Background");*/


// not solve
      /*  // 14] getRect - > it is used to get the xco-ordinate of elements and also to find the height and width of an element.
        //--> it has few methods like getPoint() and getDimension().
        //--> getPoint() method returns the instance of Point class.
        //--> getDimension() method returns the instance of Dimension class

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String el = String.valueOf(driver.findElement(By.id("email")));*/




    }
}
