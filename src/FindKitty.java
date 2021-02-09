import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindKitty {
    public void FindKitty() {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // validate correct page title
        System.out.println(driver.getTitle());

        // validate correct URL to avoid hacked websites
        System.out.println(driver.getCurrentUrl());

        // use customised xpath to find an element
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello Kitty ");

        driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
        String text = driver.findElement(By.xpath("//h2[@data-local-attribute='d3bn']")).getText();
        System.out.println(text);

        String occupation = driver.findElement(By.cssSelector("div.wwUB2c")).getText();
        System.out.println(occupation);

        // getting description
        String description = driver.findElement(By.xpath("//div[@class='kno-rdesc']")).getText();
        System.out.println(description);

        driver.close();
    }
}
