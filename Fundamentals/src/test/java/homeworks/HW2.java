package homeworks;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

import common.BaseTest;

class HW2 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.navigate().to("https://www.trademe.co.nz/");
	}

	@Test
	void test() throws IOException
	{
		driver.findElement(By.id("searchString")).sendKeys("Milk");
//		driver.findElement(By.className("btn")).click();
		driver.findElement(By.cssSelector(".btn.btn-trademe")).click();
		
		assertThat(driver.findElement(By.cssSelector(".inline-block.search-results-text")).getText())
				.isEqualTo("Search results for 'Milk'");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("Milk.png"));
		
		driver.navigate().back();
	}
}
