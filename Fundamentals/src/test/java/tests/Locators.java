package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

class Locators extends BaseTest
{
	@Test
	void test()
	{
		driver.navigate().to("https://www.kmart.com/");  
		
// BY class Name		
		driver.findElement(By.className("ribbon-kmart-logo")).click();  
		
// By CSS Selector		
		driver.findElement(By.cssSelector("#yourAccount")).click();     
		driver.navigate().refresh();
		
// By Id
		driver.findElement(By.id("keyword")).sendKeys("Milk");
		
// By link text
		driver.findElement(By.linkText("Kmart home")).click();
	}
}
