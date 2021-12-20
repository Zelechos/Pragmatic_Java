/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolsadeideas.springboot.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Zelec
 */
public class SpringBootDataJpaApplicationNGTest {
    
    private WebDriver driver;
    
    public SpringBootDataJpaApplicationNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:5050/listar");
        segundosPausa(2);
             
    }

    @Test
    public void testSomeMethod() {
        fail("The test case is a prototype.");
    }
    
    public static void segundosPausa(long sleeptime){
        try {
            Thread.sleep(sleeptime*1000);
        } catch (InterruptedException e) {
        }
    }
    
}
