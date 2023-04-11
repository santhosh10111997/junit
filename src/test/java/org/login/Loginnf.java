package org.login;

import java.util.List;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class Loginnf extends BaseClass{

	public Loginnf() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private List<WebElement> txtUsername;
	
	@FindAll({@FindBy(id="passa"),@FindBy(xpath="//input[@id='pass']")})
	private WebElement txtPassword;
	@CacheLookup
	@FindBy(name="login")
	private WebElement btnLogin;

	public List<WebElement> getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void getLogin(int index,String user,String pass) {
		sendKeys(getTxtUsername().get(index), user);
		sendKeys(getTxtPassword(), pass);
		Click(getBtnLogin());
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
