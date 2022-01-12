/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex Tumiri Huanca
 */
public class CalculatorSpringBootNGTest {

    private WebDriver driver;

    public CalculatorSpringBootNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:8080/calculadora");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    @Test
    public void testSuma() {
        driver.findElement(By.name("a")).sendKeys("5");
        driver.findElement(By.name("b")).sendKeys("6");
        driver.findElement(By.name("add")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado :11"));
    }
    
    @Test
    public void testRest() {
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.name("b")).sendKeys("5");
        driver.findElement(By.name("subtract")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 5"));
    }
    
    @Test
    public void testMultiply() {
        driver.findElement(By.name("a")).sendKeys("6");
        driver.findElement(By.name("b")).sendKeys("6");
        driver.findElement(By.name("multiply")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 36"));
    }
    
    @Test
    public void testDivide() {
        driver.findElement(By.name("a")).sendKeys("9");
        driver.findElement(By.name("b")).sendKeys("3");
        driver.findElement(By.name("divide")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 3"));
    }
    
    
    
    @Test
    public void testClearSimple() {
        driver.findElement(By.name("a")).sendKeys("0");
        driver.findElement(By.name("b")).sendKeys("0");
        driver.findElement(By.name("clearSimple")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 0"));
    }
    
    @Test
    public void testFibonacci() {
        driver.findElement(By.name("c")).sendKeys("5");
        driver.findElement(By.name("fibonacci")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 5"));
    }
    
    
    @Test
    public void testFactorial() {
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("factorial")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 362880"));
    }
    
    @Test
    public void testSqrt() {
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("sqrt")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 3.0"));
    }
    
    @Test
    public void testPower() {
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("power")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 81"));
    }
    
    @Test
    public void testClearAdvanced() {
        driver.findElement(By.name("clearAdvanced")).click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1/p")).getText().contains("Resultado: 0"));
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

}
