package javaBase.libraryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChangePasswdTest {
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

        driver.findElement(By.id("loginButton")).click();

        driver.findElement(By.linkText("密码修改")).click();
        WebElement oldPasswd=driver.findElement(By.id("oldPassswd"));
        WebElement newPasswd=driver.findElement(By.id("new Passwd"));
        WebElement renewPasswd=driver.findElement(By.id("reNewPasswd"));
        oldPasswd.sendKeys("111111");
        newPasswd.sendKeys("123456");
        renewPasswd.sendKeys("123456");
        driver.findElement(By.id("postit")).click();
        driver.findElement(By.linkText("退出")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
