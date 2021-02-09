import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public void Checkbox() {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // check whether the checkbox is ticked or not - false
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        // tick the checkbox
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        //now that checkbox is ticked, system will print out - true
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        // this prints out the numbers of total checkboxes
        // note: use findElements and size
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.close();
    }
}
