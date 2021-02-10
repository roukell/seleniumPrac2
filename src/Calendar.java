import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {
    public void Calendar() {
        System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        // nowadays, when an element is clicked, its feature will be enabled.
        // so here we don't use 'isEnabled()'. Instead, we use .getAttribute("style")
        // and then check whether the opacity is 0.5 or 1
        // if 0.5, enabled
        // if 1, disabled
        // then use assert to pass or fail the test accordingly
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it's disabled");
            Assert.assertFalse(false);
        } else {
            Assert.assertTrue(false);
        }

        driver.close();
    }
}
