package dataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import demo1.Xls_Reader1;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Xls_Reader1 reader=new Xls_Reader1("C:\\Users\\saitejamamidi\\eclipse-workspace\\SelSep19\\src\\com\\testData\\TestData.xlsx");
		int rowCount=reader.getRowCount("test");
		
		for(int i=2;i<=rowCount;i++) {
	    String userName=reader.getCellData("test","UserName", i);
	    System.out.println(userName);
	    
	    String pwd=reader.getCellData("test","Password", i);
	    System.out.println(pwd);
	    
	    
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(userName);	    
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_a")).click();
		driver.close();
		}
	}

}
