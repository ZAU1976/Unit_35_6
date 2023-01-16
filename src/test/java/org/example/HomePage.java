package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void acceptAllCookie() {
        webDriver.findElement(By.className("cookie-policy__button")).click();
    }

    public void searchGoods(String goodName) {
        WebElement searchField = webDriver.findElement(By.id("search-field"));
        searchField.sendKeys(goodName);
        searchField.submit();
    }
}
