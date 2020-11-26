package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import common.BaseTest;

class Locators extends BaseTest
{
	@Test
	void test()
	{
		driver.navigate().to("https://www.kmart.com/");
	}
}
