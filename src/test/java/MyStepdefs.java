import java.io.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyStepdefs {
    private WebDriver driver = new ChromeDriver();;
    String baseUrl = "https://www.choucairtesting.com/";


    public void setup() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    }

    @Given("I go to Choucair page")
    public void iGooToChoucairPage() {
        driver.get(baseUrl);
    }


    @When("page loads")
    public void pageLoads() {
        driver.findElement(By.linkText("Empleos")).click();
    }

    @Then("I should see Empleos sectionTitles")
    public void iShouldSeeEmpleosSectionTitles() {
        String title = driver.getTitle();
        System.out.println("Titulo de la pagina: " + title);
    }

    @Then("¿Que es ser Choucair? title should exist")
    public void que_es_ser_choucair_title_should_exist() {
        WebElement e = driver.findElement(By.xpath("//*[text()='¿Qué es ser Choucair?']"));
        String sectionTitle = e.getText();
        assertEquals("¿Qué es ser Choucair?", sectionTitle);
        throw new io.cucumber.java.PendingException();
    }


    @Then("Video Should exist and play")
    public void videoShouldExistAndPlay() {
        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/JJOe-ox3fiY?controls=1&rel=0&playsinline=0&modestbranding=0&autoplay=0&enablejsapi=1&origin=https%3A%2F%2Fwww.choucairtesting.com&widgetid=1']"));
        driver.switchTo().frame(frameElement);
        driver.findElement(By.xpath("//button[@aria-label=\'Play\']")).click();
        driver.quit();
        throw new io.cucumber.java.PendingException();
    }
}
