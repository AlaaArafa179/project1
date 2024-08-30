package AppAuth;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout {
    public static WebDriver driver= Webdriverfactory.getDriver();
    public static void logout1()
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/div/a[5]")).click();
    }
}
