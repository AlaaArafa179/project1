package AppAuth;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void login1()
    {
        driver.manage().window().maximize();
        driver.get("https://woteje4018.daftra.com/");
        driver.findElement(By.id("Email")).sendKeys("woteje4018@ndiety.com");
        driver.findElement(By.id("Password")).sendKeys("Alaa@123");
        // driver.findElement(By.className("btn")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success btn-block']")).click();
    }
}
