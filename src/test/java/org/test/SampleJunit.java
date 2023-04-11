package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.baseClass.BaseClass;
import org.junit.*;
import org.login.Loginnf;
import org.login.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleJunit extends BaseClass{
      public static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		BrowserLaunch("chrome");
		implicitlyWait(10);
        maximize();
        urlLaunch("https://www.facebook.com");

		System.out.println("brfore class");

	}
	
	@AfterClass
	public static void afterClass() {
	//	quit();
		System.out.println("after class");

	}
	
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("test start time"+d);
	

	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("test end time"+d);

	}

	@Test
	public void test1() {
		 urlLaunch("https://www.facebook.com");
		 RegisterPage r=new RegisterPage();
       Click(r.getBtngopage());
       sendKeys(r.getTxtfirstname(), "udhaya");
       sendKeys(r.getTxtlastname(), "kumar");
       sendKeys(r.getTxtphone(),"9894300423" );
       Click(r.getBtnSignup());
		System.out.println("test1");

	}
	@Test
	public void test2() throws InterruptedException {
		//verify url
		
		urlLaunch("https://www.facebook.com/");
		String url = currentUrl();
		boolean ct = url.contains("facebook");
		Assert.assertTrue("verify url",ct);
		
		Loginnf l=new Loginnf(); 
		//verify username
		 sendKeys(l.getTxtUsername().get(0), "sandy");
		 String atuser = getAttribute(l.getTxtUsername().get(0));
		 Assert.assertEquals("verify user","sandy",atuser );
		 
		 //verify password
			sendKeys(l.getTxtPassword(), "454565");
			String atpass = getAttribute(l.getTxtPassword());
			Assert.assertEquals("verify password","454565", atpass);
			
			//verify valid pagr orinvalid page
	        Click(l.getBtnLogin());
	        Thread.sleep(4000);
	        String currentUrl = currentUrl();
	        boolean contains = currentUrl.contains("privacy_mutation_token");
	        Assert.assertTrue("verify valid",contains);
		System.out.println("test2");

	}
	@Ignore
	@Test
	public void test3() {
	System.out.println("test3");
	System.out.println("okay");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
