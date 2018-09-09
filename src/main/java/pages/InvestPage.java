package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class InvestPage extends SeMethods {
	
	public InvestPage readSchemeandAmount() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> allSchemes = driver.findElementsByClassName("js-offer-name");
		for (WebElement eachScheme : allSchemes) {
			System.out.println(eachScheme.getText());
			WebElement eleAmount = driver.findElementByXPath("//span[contains(text(),'"+eachScheme.getText()+"')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
			System.out.println(eleAmount.getText());
		}
		return this;		
	}

	

}
