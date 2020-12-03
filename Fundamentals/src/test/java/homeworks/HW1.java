package homeworks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import common.BaseTest;

public class HW1 extends BaseTest
{
	@BeforeEach
	void open() throws Exception
	{
		driver.get("https://trademe.co.nz/");
	}

	@Test
	void test()
	{
		driver.findElement(By.id("CommunityDropDown")).click();
		driver.findElement(By.linkText("Announcements")).click();
		String announcement = driver.findElement(By.className("header")).getText();
		assertThat(announcement).isEqualTo("Announcements");
	}
}
