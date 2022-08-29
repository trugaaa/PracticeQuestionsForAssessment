package task_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.delete;


/**
 * 1) Explain the purpose of this file, how we use it in this project?
 * 2) What can be improved? Please improve it online.
 * 3) What mistakes do you see?
 */
public class SeleniumTest extends SearchPage {

    //Click on button "Let’s discuss your project" and assert that window is here
    @Test
    public void testOne() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");
        driver.findElements(By.xpath("//button[text()='Let’s discuss your project']")).get(0).click();
        driver.quit();
    }


    //CLick "Book a call" button and assert window is present
    @Test
    public void testTwo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");
        driver.findElements(By.xpath("//button[text()='Let’s discuss your project']")).get(0).click();
        driver.quit();
    }
}
