package org.test;

import org.junit.AfterClass;
import org.login.LoginAdactin;
import org.login.SelectPag;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.baseClass.BaseClass;
import org.junit.*;

public class JunitTask extends BaseClass {
	
   public static WebDriver driver;
	@BeforeClass
	public static void Beforeclass() {
		BrowserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
        implicitlyWait(10);
        maximize();

	}
	@AfterClass
	public static void Afterclass() throws InterruptedException {
		Thread.sleep(4000);
	 //   quit();

	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("start time "+d);
	}
	@After
	public void after() {
		Date d=new Date();
        System.out.println("end time "+d);
	}
	@Test
	public void test1() {
		//veryfy url
		urlLaunch("https://adactinhotelapp.com/");
		String url = currentUrl();
		boolean contains = url.contains("adactinhotelapp");
		Assert.assertTrue("veryfy url",contains);
		
		LoginAdactin l=new LoginAdactin();
		
		sendKeys(l.getTxtuser(), "suryajoo");
		String atuser = getAttribute(l.getTxtuser());
		Assert.assertEquals("suryajoo", atuser);
		
		sendKeys(l.getTxtpass(), "Sharma@45");
		String atpass = getAttribute(l.getTxtpass());
		Assert.assertEquals("Sharma@45", atpass);
		
		Click(l.getBtnlogin());
		String url2 = currentUrl();
		boolean contains2 = url2.contains("SearchHotel");
		Assert.assertTrue("valid ",contains2);
		System.out.println("test1");
	}
	@Test
	public void test2() {
		urlLaunch("https://adactinhotelapp.com/SearchHotel.php");
		String url = currentUrl();
		boolean b = url.contains("SearchHotel");
		Assert.assertTrue("verify url",b);
		
		SelectPag s=new SelectPag();
		Click(s.getBtnselect());
		
		Select sl=new Select(s.getBtnselect());
		
		//verify
		
	    sl.selectByValue("paris");
	    List<WebElement> list = sl.getOptions();
	    int l = list.lastIndexOf(sl);
	  //  List<WebElement> options = sl.getOptions();
	  //  boolean equals = options.equals(sl);
        
//        System.out.println(webElement);
       Assert.assertEquals("paris", l);
   
       
      //  System.out.println( getText(s.getBtnselect()));
	    Click(s.getBtnselect());
		
	}
//	@Test
//	public void test3() {
//		WebElement btnradio = driver.findElement(By.id("radiobutton_0"));
//		btnradio.click();
//		WebElement btncontinue = driver.findElement(By.id("continue"));
//		btncontinue.click();
//	}
//	
//	@Test
//	public void test4() {
//	   WebElement txtfirst = driver.findElement(By.id("first_name"));
//	   txtfirst.sendKeys("santhosh");
//	   WebElement txtlast = driver.findElement(By.id("last_name"));
//	   txtlast.sendKeys("udayan");
//	   WebElement txtaddress = driver.findElement(By.id("address"));
//	   txtaddress.sendKeys("sriperumbudur");
//	   WebElement txtcardno = driver.findElement(By.id("cc_num"));
//	   txtcardno.sendKeys("1011228098569639");
//	   WebElement cardtype = driver.findElement(By.id("cc_type"));
//	   Select s5=new Select(cardtype);
//	   s5.selectByValue("MAST");
//	   WebElement month = driver.findElement(By.id("cc_exp_month"));
//	   Select s6=new Select(month);
//	   s6.selectByIndex(11);
//	   WebElement year = driver.findElement(By.id("cc_exp_year"));
//	   Select s7=new Select(year);
//	   s7.selectByIndex(12);
//	   WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
//	   txtcvv.sendKeys("143");
//	   WebElement btncl = driver.findElement(By.id("book_now"));
//	   btncl.click();
//	}
//	@Test
//	public void test5() throws IOException {
//		System.out.println(".....ORDER NO......");
//		WebElement orderno = driver.findElement(By.name("order_no"));
//        System.out.println(orderno.getAttribute("value"));
////        File as = orderno.getScreenshotAs(OutputType.FILE);
////        File f1=new File("C:\\Users\\pavithra\\eclipse-workspace\\JavaUnitt\\screenshot\\new.png");
////        FileUtils.copyFile(as, f1);
////        System.out.println("done");
//        
//	}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
