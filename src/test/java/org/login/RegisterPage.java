package org.login;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement btngopage;

	@FindBy(name="firstname")
	private WebElement txtfirstname;
	
	@FindBy(name="lastname")
	private WebElement txtlastname;
	
	@FindBy(name="reg_email__")
	private WebElement txtphone;
	
	@FindBy(name="websubmit")
	private WebElement btnSignup;

	

	public WebElement getBtngopage() {
		return btngopage;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtphone() {
		return txtphone;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}
	
	public void getregister(String fisrname,String lastname,String phno) {
		Click(getBtngopage());
		sendKeys(getTxtfirstname(), fisrname);
		sendKeys(getTxtlastname(), lastname);
		sendKeys(getTxtphone(), phno);
		Click(getBtnSignup());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
