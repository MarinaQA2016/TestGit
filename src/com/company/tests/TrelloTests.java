package com.company.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrelloTests {
    @Test
    public void testTrello(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://trello.com/");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }

}
