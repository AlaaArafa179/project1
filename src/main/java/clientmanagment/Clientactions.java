package clientmanagment;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clientactions {
    public static WebDriver driver= Webdriverfactory.getDriver();
    public static void view()
    {

    }
    public static void edit(String updatename) {
        driver.findElement(By.xpath("//button[@class='l-dropdown-icon ui-dropdown-icon-dots-h']")).click();
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/div/a[2]")).click();
        driver.findElement(By.id("ClientBusinessName")).clear();
        driver.findElement(By.id("ClientBusinessName")).sendKeys(updatename);
        driver.findElement(By.id("submitBtn")).click();
    }
    public static void delete(){
    }

}
