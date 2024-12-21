package testcase;

import org.testng.annotations.Test;

import pageobject.home_page;
import pageobject.register_page;

public class TC_REG_001 extends base_class {
      @Test
	public void registration_succesful()
	{
		home_page hm=new home_page(driver);
		hm.clickonmyaccount();
		register_page rg=new register_page(driver);
		rg.clickregister();
		rg.setfname("Vishant");
		rg.setlname("biradar");
		rg.setemail("vishan4512gmail.com");
		rg.setphonenumber("1234567890");
		rg.setpassword("Vishant@456");
		rg.setconfpasword("Vishant@456");
		rg.clicknewslater();
		rg.clickprivacypolicy();
		rg.clcikcontbtn();
	}
}
