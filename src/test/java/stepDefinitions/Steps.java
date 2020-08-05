package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class Steps {
	
	private WebDriver driver;
	private GooglePage googpage;
	
	
//	public void setup() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().setSize(new Dimension(1366, 768));
//        googpage = PageFactory.initElements(driver, GooglePage.class);
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
//	}
	
	@Given("^User is on the google home page$")
	public void user_is_on_the_google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
        googpage = PageFactory.initElements(driver, GooglePage.class);
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		
		
		driver.get("https://google.com");
//	    throw new PendingException();
	}

	@When("^I click images$")
	public void i_click_images() throws Throwable {
        this.googpage.navImages();     
//		throw new PendingException();
	}

	@When("^searches for kittens$")
	public void searches_for_kittens() throws Throwable {
	    this.googpage.search("kittens");
//	    throw new PendingException();
	}

	@Then("^I want to see pictures of kittens$")
	public void i_want_to_see_pictures_of_kittens() throws Throwable {
		assertEquals("kittens",this.googpage.seeSearched());
	    
//	    throw new PendingException();
	}
	@After
	public void tearDown() {
        driver.quit();
    }

}
