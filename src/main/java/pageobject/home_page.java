package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
WebDriver driver;
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myaccount;

	public void clickonmyaccount()
	{
		myaccount.click();
	}
	public home_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
