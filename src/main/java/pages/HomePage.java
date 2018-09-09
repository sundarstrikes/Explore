package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class HomePage extends SeMethods {

	public HomePage moveMouseoverInvestment() {
		
		WebElement eleInvestment = locateElement("linktext", "INVESTMENTS");
		Actions builder = new Actions(driver);
		builder.moveToElement(eleInvestment).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;		
	}


	public MutualFundsPage clickMutualFunds() {
		WebElement eleMutualFunds= locateElement("linktext", "Mutual Funds");
		click(eleMutualFunds);
		return new MutualFundsPage();		
	}



}


