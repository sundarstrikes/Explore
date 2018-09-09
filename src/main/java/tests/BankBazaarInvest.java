package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.SeMethods;
@Test
public class BankBazaarInvest extends SeMethods {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_Invest";
		testCaseDescription ="Invest in bankbazaar";
		category = "Regression";
		author= "Pavi";
	}

	public  void investinBankBazaar()   {
		String browser = "chrome";
		String url = "https://www.bankbazaar.com/";
		startApp(browser,url);
		new HomePage()
		.moveMouseoverInvestment()
		.clickMutualFunds()
		.clickSearchMutualFunds()
		.selectAge()
		.selectMonthandYear()
		.selectDate()
		.clickContinueinMutualfund()
		.selectAnnualIncome()
		.clickContinueinMutualfund()
		.selectBank()
		.inputFirstName()
		.clickViewMutualFunds()
		.readSchemeandAmount();
		closeBrowser();
		

		
		
	}
}
