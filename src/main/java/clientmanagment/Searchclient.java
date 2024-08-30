package clientmanagment;

import Utilities.Webdriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchclient {
    public static WebDriver driver= Webdriverfactory.getDriver();
    public static void search(String Clientname){
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[2]/div/div/input")).sendKeys("Alaa");
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();

        //search after edit
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
        WebElement searchbox= driver.findElement(By.name("filter[first_name][like]"));
        searchbox.clear();
        driver.findElement(By.name("filter[first_name][like]")).sendKeys(Clientname);
        driver.findElement(By.xpath("//*[@id=\"treasuries-filters\"]/div/div/div[12]/button")).click();

    }
}
