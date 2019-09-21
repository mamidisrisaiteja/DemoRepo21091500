package demo1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ApacheDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();    
		driver.get("https://www.google.com/");
		TakesScreenshot ts=((TakesScreenshot)driver);
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\saitejamamidi\\eclipse-workspace\\SelSep19\\src\\screenshots.png"));

	}

}
