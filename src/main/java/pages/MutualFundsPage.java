package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class MutualFundsPage extends SeMethods{
	
// click search mutual funds
	public MutualFundsPage clickSearchMutualFunds() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleSearchMutualFunds= locateElement("xpath", "//a[text()='Search for Mutual Funds']");
		click(eleSearchMutualFunds);
		return this;		
	}	
	
	
	
	public MutualFundsPage selectAge() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleSelectAge= locateElement("xpath", "//div[@class='rangeslider__handle']");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleSelectAge,66, 0).perform();
		return this;		
	}
	
	
	public MutualFundsPage selectMonthandYear() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleSelectmonyear= locateElement("xpath", "//a[contains(text(),'Oct 1990')]");
		click(eleSelectmonyear);
		return this;		
	}
	
	
	public MutualFundsPage selectDate() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleSelectDater= locateElement("xpath", "//div[contains(text(),'25')]");
		click(eleSelectDater);
		return this;		
	}
	
	
	
	public MutualFundsPage clickContinueinMutualfund() {
		
		WebElement eleContinue1 = locateElement("linktext", "Continue");
		click(eleContinue1);
		return this;		
	}
	
	
	public MutualFundsPage selectAnnualIncome() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleSelectIncome= locateElement("xpath", "//div[@class='rangeslider__handle']");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleSelectIncome,395, 0).perform();
		return this;		
	}

	
	
	
	public MutualFundsPage selectBank() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleselectBank = locateElement("xpath", "//span[contains(text(),'Kotak Mahindra')]");
		click(eleselectBank);
		return this;		
	}
	
	
	
	
	public MutualFundsPage inputFirstName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleselectBank = locateElement("xpath", "//input[@name='firstName']");
		type(eleselectBank,"Sundar");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;		
	}
	
	
	
	
	
	public InvestPage clickViewMutualFunds() {
		
		WebElement eleViewMutualFunds = locateElement("linktext", "View Mutual Funds");
		click(eleViewMutualFunds);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new InvestPage();		
	}	
	
	
	
	
	

}
