package com.com470.seleniumMercuryApp;

import java.sql.Driver;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumMercuryAppApplicationNGTest {

    private WebDriver driver;

    public SeleniumMercuryAppApplicationNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://newtours.demoaut.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    @Test
    public void testLogeoFallido() {
        driver.findElement(By.name("userName")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user");
        driver.findElement(By.name("login")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText().contains("Welcome back to Mercury Tours!"));
    }
    @Test
    public void testLogeoExitoso() {
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        assertTrue(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText().contains("Flight Finder to search"));
    }
    
    @Test
    public void testPasajeros() {
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        //texto visible
        Select selectPasajeros= new Select(driver.findElement(By.name("passCount")));
        selectPasajeros.selectByVisibleText(Integer.toString(2));
        //por el indice
        Select selectFrom= new Select(driver.findElement(By.name("fromPort")));
        selectFrom.selectByIndex(3);
        //por el valor
        Select selectArriving= new Select(driver.findElement(By.name("toPort")));
        selectPasajeros.selectByValue("London");
              
        //assertTrue(driver.
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

}
