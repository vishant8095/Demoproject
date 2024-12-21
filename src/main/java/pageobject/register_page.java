package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class register_page {
	WebDriver driver;
	@FindBy(xpath="(//a[text()='Register'])[1]")
	WebElement register;
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement phonenumber;
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement confpassword;
	@FindBy(xpath="//input[@name='newsletter'and@value='0']")
	WebElement newslatter;
	@FindBy(xpath="//input[@name='agree']")
	WebElement privecypolicy;
	@FindBy(xpath="//input[@name='agree']/following-sibling::input")
	WebElement continuebt;
	public void clickregister()
	{
		register.click();
	}
	public void setfname(String str)
	{
		firstname.sendKeys(str);;
	}
	public void setlname(String str)
	{
		lastname.sendKeys(str);;
	}
	public void setemail(String str)
	{
		email.sendKeys(str);;
	}
	public void setphonenumber(String str)
	{
		phonenumber.sendKeys(str);;
	}
	public void setpassword(String str)
	{
		phonenumber.sendKeys(str);
	}
	public void setconfpasword(String str)
	{
		confpassword.sendKeys(str);
	}
	public void clicknewslater()
	{
		newslatter.click();
	}
	public void clickprivacypolicy()
	{
		privecypolicy.click();
	}
	public void clcikcontbtn()
	{
		continuebt.click();
	}
	public register_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
