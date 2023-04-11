package org.login;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectPag extends BaseClass {

	public SelectPag() {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id="location")
	private WebElement btnselect;
	public WebElement getBtnselect() {
		return btnselect;
	}
	
	public void getsel(String value) {
		
		Click(getBtnselect());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
