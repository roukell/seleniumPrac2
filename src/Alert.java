import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public void Alert() {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Melody");

        // click on alert
        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
        //get text from alert and print
        System.out.println(driver.switchTo().alert().getText());

        // click ok when alert is prompted
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Missy");
        driver.findElement(By.id("confirmbtn")).click();
        // cancel alert
        driver.switchTo().alert().dismiss();

        driver.close();
    }
}
