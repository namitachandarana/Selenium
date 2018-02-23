package org.selenium.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//Chrome Driver
//System.setProperty("webdriver.chrome.driver", "C://Users//ChandaN//Documents//PratiseProjects//SeleniumDrivers//chromedriver_win32//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();

System.setProperty("webdriver.gecko.driver", "C:\\Users\\ChandaN\\Documents\\PratiseProjects\\SeleniumDrivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://automationpractice.com/");



	}}