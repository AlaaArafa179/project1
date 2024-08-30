package clientmanagment;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addclient {
    public static WebDriver driver = Webdriverfactory.getDriver();
    public static void addClient(String Clientname) {

        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/ol/div[2]/div[2]/div[4]/div/div[4]/a/i")).click();
        driver.findElement(By.id("ClientBusinessName")).sendKeys(Clientname);
        driver.findElement(By.xpath("//*[@id=\"submitBtn\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
    }
}
