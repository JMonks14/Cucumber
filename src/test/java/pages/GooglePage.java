package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	@FindBy(xpath="//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")
	private WebElement images;
	
	@FindBy(xpath="//*[@id=\"sbtc\"]/div/div[2]/input")
	private WebElement imgSearch;
	
	@FindBy(xpath="//*[@id=\"REsRA\"]")
	private WebElement searched;
	
	public void navImages() {
		this.images.click();
	}

	public GooglePage() {
		// TODO Auto-generated constructor stub
	}
	
	public void search(String search) {
		this.imgSearch.sendKeys(search);
		this.imgSearch.submit();
	}
	
	public String seeSearched() {
		String ret = this.searched.getAttribute("value");
		return ret;
	}
	
	

}
