package tests.existance;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import common.BaseTest;
class ElementExists extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://www.kmart.com/");
	}
	@Test
	void test()
	{
		String titleToSwitch = "Home";
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.xpath("//a[@href='https://searskmart.force.com/kmartask\']")).click();
	}
}