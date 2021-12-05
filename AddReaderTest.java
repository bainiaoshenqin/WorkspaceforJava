package javaBase.libraryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddReaderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\tools\\EdgeDriver\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("http://localhost:8080");
        WebElement username=driver.findElement(By.id("id"));
        username.sendKeys("123456");
        WebElement passwd=driver.findElement(By.id("passwd"));
        passwd.sendKeys("111111");
        driver.findElement(By.id("remember")).click();
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.linkText("读者管理")).click();
        driver.findElement(By.linkText("增加读者")).click();
        WebElement password=driver.findElement(By.id("password"));
        WebElement name=driver.findElement(By.id("name"));
        WebElement sex=driver.findElement(By.id("sex"));
        WebElement birthday=driver.findElement(By.id("birth"));
        WebElement address=driver.findElement(By.id("address"));
        WebElement telephone=driver.findElement(By.id("phone"));
        password.sendKeys("000000");
        name.sendKeys("江洋");
        sex.sendKeys("男");
        birthday.sendKeys("2021/12/4");
        address.sendKeys("翻斗花园");
        telephone.sendKeys("13347472121");
        driver.findElement(By.id("added")).click();
    }
}
