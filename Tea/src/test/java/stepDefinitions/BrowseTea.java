package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TeaHome;

public class BrowseTea {
	
	private WebDriver driver;
	private TeaHome home;
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
        home = PageFactory.initElements(driver, TeaHome.class);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(this.home.getUrl());
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    this.home.clickMenu();
	    
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	    assertEquals("Green Tea", this.home.getgreenTea());
//	    Thread.sleep(5000);
	}
	
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    this.home.clickMenu();
		this.home.checkOut();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    assertEquals(this.home.getCheckouturl(), driver.getCurrentUrl());
	}
	
	@After
	public void tearDown() {
        driver.quit();
    }
}


