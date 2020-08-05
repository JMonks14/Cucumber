package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaHome {
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menu;
	private String url;
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	private WebElement greenTea;
	private String menuurl;
	private String checkouturl;
	@FindBy(xpath="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement checkout;
	
	public TeaHome() {
		this.url="http://www.practiceselenium.com/welcome.html";
		this.menuurl="http://www.practiceselenium.com/menu.html";
		this.checkouturl="http://www.practiceselenium.com/check-out.html";
	}
	
	public String getCheckouturl() {
		return checkouturl;
	}

	public void clickMenu() {
		this.menu.click();
	}

	public String getUrl() {
		return url;
	}
	
	public String getgreenTea() {
		return this.greenTea.getText();
	}

	public String getMenuurl() {
		return menuurl;
	}
	public void checkOut() {
		this.checkout.click();
	}

	
}
