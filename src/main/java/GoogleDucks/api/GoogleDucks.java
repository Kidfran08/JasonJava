package GoogleDucks.api;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDucks {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("ducks" + Keys.ENTER);



        String expectedInTitle = "ducks";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.err.println("Title verification FAILED!!!");
            System.out.println("expectedInTitle = " + expectedInTitle);
            System.out.println("actualTitle = " + actualTitle);
        }

        driver.close();
    }
}
