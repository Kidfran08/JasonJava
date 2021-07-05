package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class DemoRun {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");// hit url on the brwoser
        System.out.println(driver.getTitle());// validate if your page titile is correct
        System.out.println(driver.getCurrentUrl());// landed on correct url
       // System.out.println(driver.getPageSource());// print page source

        driver.get("https://www.yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();

        driver.close();
    }
}
