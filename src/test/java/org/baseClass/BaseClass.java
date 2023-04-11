package org.baseClass;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.sample.BrowserLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public static WebDriver driver;
	
	 public static WebDriver BrowserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
		}
		return driver;
	}
	 

	public static WebDriver ChromeBrowser() {
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver firefoxBrowser() {
		 WebDriverManager.firefoxdriver().setup();
		  return driver=new FirefoxDriver();
		
	}
	public static WebDriver edgebrowser() {
		WebDriverManager.edgedriver().setup();
 return driver=new EdgeDriver();
	
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void implicitlyWait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);

	}
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);

	}
	public static void Click(WebElement e) {
		e.click();

	}
	public static void quit() {
	driver.quit();

	}
	public static String currentUrl() {
	String	url=driver.getCurrentUrl();
	return url;

	}
	public static String title() {
		String title = driver.getTitle();
		return driver.getTitle();

	}
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
        a.moveToElement(target).perform();
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
        a.dragAndDrop(source, target).perform();
	}
	public static void contextClick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick(target).perform();

	}
	
	public static void doubleClick() {
		Actions a=new Actions(driver);
        a.doubleClick().perform();
	}
public static String getText(WebElement e) {
	String text = e.getText();
	return text;

}
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
		
	}
//	public static void executeScript(String arguments) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].setAttribute('value','name'");
//	}
	public static String getWindowHandle() {
		String parentid = driver.getWindowHandle();
		return parentid;

	}
	public static Set<String> getWindowHandles() {
		Set<String> allid = driver.getWindowHandles();
		return allid;

	}
	//excel
	public static String getExcel(String Excel,String sheetNumber,int rowNumber,int cellNumber) throws IOException {
	File locat=new File("C:\\Users\\pavithra\\eclipse-workspace\\MavenNew\\src\\test\\resources\\"+Excel+".xlsx");
		FileInputStream fi=new FileInputStream(locat);
		//workbook  ( xls=HSSFWorkbook   xlsx=XSSFWorkbook )
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetNumber);
		Row r = s.getRow(rowNumber);
		Cell cell = r.getCell(cellNumber);
		int type = cell.getCellType();
		String value=null;
		if(type==1) {
			 value = cell.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
				 value = new SimpleDateFormat("dd.MM.yyyy").format(cell.getDateCellValue());
			}
			else {
				 value = String.valueOf((long)cell.getNumericCellValue());
			}
		}
		return value;
	}
	public void selectByValue(WebElement e,String value) {
		Select s=new Select(e);
        s.selectByValue(value);
	}
	public static void screenShot(String name) throws IOException {
TakesScreenshot tk=(TakesScreenshot)driver;
 File src = tk.getScreenshotAs(OutputType.FILE);
 File dec=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshot\\"+name+".png");
 FileUtils.copyFile(src, dec);
	}
	
}




































