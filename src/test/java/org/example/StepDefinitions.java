package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StepDefinitions {

    private static final HomePage homePage;

    private static final WebDriver webDriver;
    static {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZAU\\IdeaProjects\\scenario\\src\\test\\resources\\chromedriver.exe");
       webDriver = new ChromeDriver();
       homePage = new HomePage(webDriver);
    }

    @Given("url of labirint {string}")
    public void url_of_labirint(String url) {
        webDriver.get(url);
    }

    @When("website is open accept all cookie")
    public void website_is_open_accept_all_cookie() {
        homePage.acceptAllCookie();
    }

    @Then("start search {string}")
    public void start_search(String searchParam) {
        homePage.searchGoods(searchParam);
    }
    @Then("ckick on first")
    public void ckick_on_first() {
        webDriver.findElement(By.className("book-img-cover")).click();
    }
    @Then("click add button")
    public void click_add_button() {
        webDriver.findElement(By.className("text")).click();
    }
}
