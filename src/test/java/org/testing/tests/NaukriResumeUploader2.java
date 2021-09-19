package org.testing.tests;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriResumeUploader2 {

	@Test

	public void resumeUploader() throws InterruptedException, MalformedURLException {
		String mainWindow, childWindow;

		ChromeOptions chromeOptions = new ChromeOptions(); //
		chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		mainWindow = driver.getWindowHandle();
		driver.get("https://www.naukri.com/");
		driver.quit();

	}

}
