package tests.table;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest;

class Tables extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://the-internet.herokuapp.com/tables");
	}

	@Test
	void test()
	{
		List<WebElement> rows = driver.findElements(By.xpath("//table[2]/tbody/tr"));
		int numberOfRows = rows.size();
		System.out.println("Number of rows in the Table 2: " + numberOfRows);
		
//1 Метод		
		System.out.println("First Method");
		for (WebElement row: rows)
			System.out.println(row.getText().split(" ")[3]);
		
//2 Метод
		System.out.println("\nSecond Method");
		String cellXpath = "";
		for (int i = 1; i <= numberOfRows; i++) {
			cellXpath = "//table[2]/tbody/tr[" + i + "]/td[4]";
			System.out.println(driver.findElement(By.xpath(cellXpath)).getText());
		}
		
//3 Метод
		System.out.println("\nThird Method");
		var cellText = new ArrayList<String>();
		List<WebElement> column = driver.findElements(By.cssSelector("//td[@class='dues']"));
		for (WebElement cell: column)
			System.out.println();
	}
}
