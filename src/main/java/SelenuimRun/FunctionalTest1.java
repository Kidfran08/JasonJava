package SelenuimRun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class FunctionalTest1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver Driver = new ChromeDriver();
        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Carrot"};
        int j=0;
        Driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000L);

        List<WebElement> products = Driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++)
            {
                //Brocolli - 1 Kg
            String[] name = products.get(i).getText().split("-");
            String formatedName=name[0].trim();
            // check weather name you extracted is present in array or not
                // convert array into array list for easy search

                List I1= Arrays.asList(itemsNeeded);
                System.out.println(I1);


            if (I1.contains(formatedName)) {

                j++;
                Driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();


                if (j==itemsNeeded.length){
                    break;
                }

            }
            }
    }
}
