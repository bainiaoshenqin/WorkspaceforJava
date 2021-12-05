package javaBase.libraryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditReaderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","D:\\tools\\EdgeDriver\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get("http://localhost:8080");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement username=driver.findElement(By.id("id"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //注释，在贴出测试代码时此字段只会显示正确字段，在真实测试过程中此字段会被更换成用例字段
        username.sendKeys("123456");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwd=driver.findElement(By.id("passwd"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //注释，在贴出测试代码时此字段只会显示正确字段，在真实测试过程中此字段会被更换成用例字段
        passwd.sendKeys("111111");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("remember")).click();
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.linkText("读者管理")).click();
        driver.findElement(By.linkText("全部读者")).click();
        driver.findElement(By.id("edit")).click();
        WebElement password=driver.findElement(By.id("password"));
        WebElement name=driver.findElement(By.id("name"));
        WebElement sex=driver.findElement(By.id("sex"));
        WebElement birthday=driver.findElement(By.id("birth"));
        WebElement address=driver.findElement(By.id("address"));
        WebElement telephone=driver.findElement(By.id("phone"));
        name.sendKeys("江洋");
        sex.sendKeys("男");
        birthday.sendKeys("2021/12/4");
        address.sendKeys("翻斗花园");
        telephone.sendKeys("13347472121");
        driver.findElement(By.id("added")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
