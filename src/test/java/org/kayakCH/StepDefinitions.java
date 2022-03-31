package org.kayakCH;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private WebDriver webDriver;
    private String baseUrl = "https://www.kayak.ch";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Given("a user connected to kayak site")
    public void a_user_connected_to_kayak_site() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(baseUrl);
        webDriver.findElement(By.xpath("//span[normalize-space()='No grazie']")).click();
    }
        @When("a user choose the departure {string} and arrival {string} airports")
    public void a_user_choose_the_departure_and_arrival_airports(String dep, String arr) throws InterruptedException {
            Thread.sleep(5000);
            WebElement depAirport = webDriver.findElement(By.cssSelector("div[aria-label='Seleziona origine'][role='textbox']"));
            depAirport.click();
            Thread.sleep(5000);
            WebElement depAirport2 =webDriver.findElement(By.cssSelector(".k_my-input"));
            depAirport2.sendKeys(dep);
            Thread.sleep(3000);
            depAirport2.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            WebElement arrAirport = webDriver.findElement(By.cssSelector("div[aria-label='Destinazione volo'][role='textbox']"));
            arrAirport.click();
            Thread.sleep(5000);
            WebElement arrAirport2 =webDriver.findElement(By.cssSelector(".k_my-input"));
            arrAirport2.sendKeys(arr);
            Thread.sleep(5000);
            arrAirport2.sendKeys(Keys.ENTER);
            Thread.sleep(5000);
        }

    @When("a user choose the departure {string} and return {string} time range")
    public void a_user_choose_the_departure_and_return_time_range(String dateFrom, String dateTo) throws InterruptedException{
       WebElement depDate = webDriver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > main:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(2)"));
        depDate.click();
        WebElement depDate2 = webDriver.findElement(By.xpath("//div[@class='mkUa mkUa-pres-default mkUa-isStartDate mkUa-isSelected mkUa-isFocused']"));
        depDate2.click();
        Thread.sleep(5000);

        /*WebElement arrDate = webDriver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > main:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > section:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(2)"));
        arrDate.click();
        WebElement arrDate2 = webDriver.findElement(By.xpath("//div[@aria-label='21 maggio 2022']"));
        arrDate2.click();*/

        Thread.sleep(5000);

    }


    @When("a user start the search")
    public void a_user_start_the_search() throws InterruptedException{
       webDriver.findElement(By.cssSelector("button[aria-label='Cerca']")).click();
        Thread.sleep(10000);
        //webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //WebDriverWait wait = new WebDriverWait(webDriver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#searchResultsList")));




    }



    @When("a user choose the max price in CHF {string}")
    public void a_user_choose_the_max_price_in_CHF(String string) {


    }


    @Then("the system shows the flights")
    public void the_system_shows_the_flights() throws InterruptedException {

        Thread.sleep(5000);



    }

    @After
    public void end() {
        System.out.println("Process End");
        /*if (webDriver != null) {
            webDriver.quit();
        } */
    }

}
