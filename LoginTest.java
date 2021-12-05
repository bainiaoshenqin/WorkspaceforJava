package javaBase.libraryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\tools\\EdgeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://localhost:8080");
        WebElement username = driver.findElement(By.id("id"));
        //注释，在贴出测试代码时此字段只会显示正确字段，在真实测试过程中此字段会被更换成用例字段
        username.sendKeys("123456");
        WebElement passwd = driver.findElement(By.id("passwd"));
        //注释，在贴出测试代码时此字段只会显示正确字段，在真实测试过程中此字段会被更换成用例字段
        passwd.sendKeys("111111");
        driver.findElement(By.id("loginButton")).click();
    }
}
