package tests.js;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import common.BaseTest;

class Scrolling extends BaseTest
{
	@BeforeEach
	void oepn() throws Exception
	{
		driver.get("http://www.kmart.com/");
	}

	@Test
	void test() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0, 5000)");
		Thread.sleep(5000);
	}
}
